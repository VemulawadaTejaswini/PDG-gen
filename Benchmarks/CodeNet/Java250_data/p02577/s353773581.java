import java.util.Scanner;

public class Main {

	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int sum = 0;
		for(int i = 0; i<n.length();i++) {
			int tmp= Character.getNumericValue(n.charAt(i));
//			System.out.println(tmp);
			sum+=tmp;
		}
//		System.out.println(sum);
		if(sum%9==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
//		System.out.println(ans);
	}
}