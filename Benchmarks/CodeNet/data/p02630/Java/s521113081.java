    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n+1];
            A[0] = 0;
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
                S[0] = S[0] + a[i];
            }
            int[] n = new int[100000+1];
            for (int i = 0; i < n.length; i++) {
                n[i] = 0;
            }
            for (int i = 1; i < a.length; i++) {
                n[a[i]] = n[a[i]] + 1;
            }
            for (int i = 1; i < q+1; i++) {
                s[i] = (c[i]-b[i])*n[b[i]] + s[i-1];
                System.out.println(s[i]);
                n[c[i]] = n[c[i]] + n[b[i]];
                n[b[i]] = 0;
            }
        }
    }