import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		 
		int N = scan.nextInt();
		String A = scan.next();
		String B = scan.next();
 
		char[] ac = A.toCharArray();
		char[] bc = B.toCharArray();
 
		//ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
 
		for(int i = 0; i< N; i++) {
			sb.append(ac[i]);
			sb.append(bc[i]);
		}
		
		System.out.println(sb.toString());
	}
}