import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String S = sc.next();
		int[] countWest = new int[n];
		
		int ans = Integer.MAX_VALUE;
		
		for (int i=0;i<n;i++) {
			countWest[i] = (i==0 ? 0 : countWest[i-1])
					+ (S.charAt(i)=='W' ? 1: 0);
		}
		
		for (int i=0;i<n;i++) {
			ans = Math.min(ans, (i==0 ? 0 : countWest[i-1])
					+ (i==n-1 ? 0 : (n-1-i-(countWest[n-1]-countWest[i]))));
		}
		
		System.out.println(ans);

	}

}
