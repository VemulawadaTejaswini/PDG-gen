import java.util.Scanner;

// 19
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0; i < m; i++)
            a[sc.nextInt()] = 1;

        int left = 0;
        int right = 0;
        for(int i = 0; i < x; i++)
            left += a[i];
        for(int i = x; i < n + 1; i++)
            right += a[i];

        System.out.println(Math.min(left, right));
    }

}
