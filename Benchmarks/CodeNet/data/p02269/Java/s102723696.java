    import java.util.Scanner;
    public class Main {
        public static int M = 1046527;
        public static char H[][] = new char[M][14];
        public static char x[] = new char[14];
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String cmd, s;
            for(int i = 0; i < N; i++) {
                char []str = new char[14];
                cmd = scan.next();
                s = scan.next();
                for(int j = 0; j < s.length(); j++) {
                    str[j] = s.charAt(j);
                }
                if(cmd.charAt(0) == 'i') {
                    insert(str);
                }else {
                    if(find(str) == 1) {
                        System.out.println("yes");
                    }else {
                        System.out.println("no");
                    }
                }
            }
            scan.close();
        }
        public static int getChar(char ch) {
            if(ch == 'A') return 1;
            else if(ch == 'C') return 2;
            else if(ch == 'G') return 3;
            else if(ch == 'T') return 4;
            else return 0;
        }
        public static long getKey(char []str) {
            long sum = 0;
            long p = 1;
            for(int i = 0; i < 14; i++) {
                sum += p * (getChar(str[i]));
                p *= 5;
            }
            return sum;
        }
        public static int find(char []str) {
            long key = getKey(str);
            int h;
            for(int i = 0;; i++) {
                h = (h1(key) + i * h2(key)) % M;
                if(isCheck(H[h], str)) return 1;
                else if(H[h][0]== x[0]) return 0;
            }
        }
        public static boolean isCheck(char[] c1, char[] c2) {
            for(int i = 0; i < 14; i++) {
                if(c1[i] != c2[i]) {
                    return false;
                }
            }
            return true;
        }
        public static void strcpy(char[] c1, char[] c2) {
            for(int i = 0; i < 14; i++) {
                c1[i] = c2[i];
            }
        }
        public static int insert(char str[]) {
            long key = getKey(str);
            int h;
            for(int i = 0;; i++) {
                h = (h1(key) + i * h2(key)) % M;
                if(isCheck(H[h], str)) return 1;
                else if(H[h][0]== x[0]) {
                    strcpy(H[h], str);
                    return 0;
                }
            }
        }
        public static int h1(long key) {
            return (int)(key % M);
        }
        public static int h2(long key) {
            return (int)(key % (M - 1));
        }
        public static void disp(char []c) {
            for(int i = 0; i < 14; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
        }
    }
