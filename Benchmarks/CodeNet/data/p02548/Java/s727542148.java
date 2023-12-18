import java.util.Scanner;

public class Main {
	// 2-100
	public static String check(int x, int y) {
		
		return "";
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = 0;
		int vit = 0;
		for(int i=1; i<n; i++) {
	        for(int j=1; i*j<n; j++) {
	            ans++;
	        }
	    }
		System.out.println(ans);

	}

}