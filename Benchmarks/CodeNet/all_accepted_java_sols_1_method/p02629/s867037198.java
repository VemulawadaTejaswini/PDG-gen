    import java.util.Scanner;
     
    public class Main {
        public static void main(String args[]) {
            char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();
     
            Scanner scan = new Scanner(System.in);
     
            long n = scan.nextLong();
     
            StringBuilder sb = new StringBuilder();
            int t;
            for (; n > 0; n = (n - 1) / 26) {
                t = (int) ((n - 1) % 26);
                sb.append(ch[t]);
            }
     
            System.out.println(sb.reverse().toString());
        }
    }

