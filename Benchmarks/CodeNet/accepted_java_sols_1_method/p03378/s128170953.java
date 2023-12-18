import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < m; i++) {
            if(x > a[i]) sum1++;
            else if(x < a[i]) sum2++;
        }
        System.out.println(Math.min(sum1, sum2));
    }
}