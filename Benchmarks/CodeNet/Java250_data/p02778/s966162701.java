import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		int a = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++) {
			sb.append('x');
		}

		System.out.println(sb.toString());



	}
}
