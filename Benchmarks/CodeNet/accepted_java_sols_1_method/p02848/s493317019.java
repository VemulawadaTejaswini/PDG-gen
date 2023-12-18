import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();

		int end = (int)'Z';

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			int temp = (int)s.charAt(i);
			if(temp + n > end) {
				sb.append((char)(temp + n - 26));
			}else {
				sb.append((char)(temp + n));
			}
		}
		System.out.println(sb.toString());
	}
}
