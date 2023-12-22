import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int m = sc.nextInt();
            char[] s = sc.next().toCharArray();
            int count = 0;
            int[] a = new int[m];
            for (int i = 2; i < m; i++) {
                if (s[i - 2] == 'I' && s[i - 1] == 'O' && s[i] == 'I') {
                   a[i]=a[i-2]+1;
                   if(n<=a[i]) {
                       count++;
                   }
                }
            }
            System.out.println(count);
        }
    }
}
