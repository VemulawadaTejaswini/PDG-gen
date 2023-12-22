import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		for(int i = (x - k + 1);i <= (x + k - 1); i++) {
			sb.append(i).append(" ");
		}
		sb.setLength(sb.length()-1);

		System.out.println(sb.toString());
	}
}
