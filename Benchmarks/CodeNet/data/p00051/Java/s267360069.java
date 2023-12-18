import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		char[] num = new char[8];
		
		for (int i=0; i<n; i++) {
			num = sc.next().toCharArray();
			Arrays.sort(num);
			
			StringBuilder sb = new StringBuilder();
			for (int j=0; j<8; j++) {
				sb.append(num[j]);
			}
			int min = Integer.parseInt(sb.toString());
			
			sb.setLength(0);
			for (int j=7; j>=0; j--) {
				sb.append(num[j]);
			}
			int max = Integer.parseInt(sb.toString());
			
			out.println(Math.abs(max-min));
		}
	}
}
