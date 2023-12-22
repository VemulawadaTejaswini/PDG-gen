import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		final int NUMBER = 753;
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i <s.length()-2;i++) {
			int temp = Integer.parseInt(s.substring(i,i+3));
			if(Math.abs(NUMBER-temp)<ans) {
				ans = Math.abs(NUMBER-temp);
			}
		}
		System.out.println(ans);
	}
}