import java.util.Scanner;

public class Main {        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int left = 1;
        int right = n;

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            left = Math.max(left, l);
            right = Math.min(right, r);
        }
        System.out.println(Math.max(0, right - left + 1));
    }
}