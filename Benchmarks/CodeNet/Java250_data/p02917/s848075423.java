import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int [n - 1];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int ans = b[0];
        for (int i = 0; i < b.length; i++) {
            if(i == b.length - 1) {
                //System.out.println(b[i]);
                ans += b[i];
            } else {
                int min = Math.min(b[i], b[i + 1]);
                //System.out.print(min + " ");
                ans += min;
            }
        }
        System.out.println(ans);
    }
}