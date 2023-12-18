import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<m; i++) {
            a[sc.nextInt()-1]++;
            b[sc.nextInt()-1]++;
        }
        sc.close();

        for(int i=0; i<n; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}
