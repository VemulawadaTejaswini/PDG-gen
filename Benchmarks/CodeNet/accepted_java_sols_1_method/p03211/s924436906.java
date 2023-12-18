import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < S.length()-2; i++) {
			String substr = S.substring(i, i+3);
			int num = Integer.parseInt(substr);
			int sa = Math.abs(num - 753);
			ans = Math.min(ans, sa);
		}
		
		System.out.print(ans);
	}
}