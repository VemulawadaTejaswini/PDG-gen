import java.util.Scanner;

public class Main {
	static String N;

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.next();
		}
		long summary=0;
		for(int i=0;i<N.length();i++) {
			summary += Long.parseLong(N.substring(i,i+1));
		}
			
		if (summary%9==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
