import java.util.Scanner;

public class Main {
	static int[] b;
	static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        b = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
        	b[i] = scan.nextInt();
        }
        int ans = 0;
        for(int i = b.length - 1 ; i >= 1 ; i--) {
        	ans += Math.min(b[i], b[i - 1]);
        }
        ans += b[0];
        ans += b[b.length - 1];

        System.out.println(ans);
    }
}