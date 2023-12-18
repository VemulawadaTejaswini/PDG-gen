import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		
		String ans = "";
		StringBuilder sb = new StringBuilder();
		
		sb.append("Christmas");
		while(25-D>0) {
			sb.append(" Eve");
			D++;
		}
		ans = sb.toString();
		System.out.println(ans);
	}
}
