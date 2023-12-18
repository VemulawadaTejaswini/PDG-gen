import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		for(int i=0 ; i<cnt*2 ; i++) {
			char[] a = s.nextLine().toCharArray();
			char[] b = s.nextLine().toCharArray();
			System.out.println(solve(a, b));
		}
	}

	public static int solve(char[] a, char[] b) {
		int[][] result = new int[a.length+1][b.length+1];
		for(int i=1 ; i<=b.length ; i++) {
			for(int j=1 ; j<=a.length ; j++) {
				if(a[j-1]==b[i-1]) {
					result[j][i] = result[j-1][i-1] + 1;
				}else {
					result[j][i] = Math.max(result[j][i-1], result[j-1][i]);
				}
			}
		}
		return result[a.length][b.length];
	}

}