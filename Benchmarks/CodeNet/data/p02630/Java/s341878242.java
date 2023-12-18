    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n+1];
            a[0] = 0;
            for (int i = 1; i < n+1; i++) {
                a[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            int[] b = new int[q+1];
            int[] c = new int[q+1];
            b[0] = 0;
            c[0] = 0;
            for (int i= 1; i < q+1; i++) {
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            long[] s = new long[q+1];
            s[0] = 0;
            for (int i = 0; i < a.length; i++) {
                s[0] = s[0] + a[i];
            }
            int[] num = new int[100000+1];
          for (int i = 0; i < num.length; i++) {
            num[i] = 0;
           }
            for (int i = 1; i < a.length; i++) {
                num[a[i]] = num[a[i]] + 1;
            }
            for (int i = 1; i < q+1; i++) {
                s[i] = (c[i]-b[i])*num[b[i]] + s[i-1];
                System.out.println(s[i]);
                num[c[i]] = num[c[i]] + num[b[i]];
                num[b[i]] = 0;
            }
        }
    }