import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int maxv = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int j = 0; j < n; j++) {
			int r = sc.nextInt();
			maxv = Math.max(maxv, r - min);
			min = Math.min(min, r);
		}
		
		System.out.println(maxv);
	}
}
