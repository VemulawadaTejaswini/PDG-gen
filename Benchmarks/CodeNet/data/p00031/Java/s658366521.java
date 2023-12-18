import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean[] memo = new boolean[10];
		
		while (sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			int weight = sc.nextInt();
			for (int i=9; i>=0; i++) {
				if (weight >= Math.pow(2,i)) {
					weight -= Math.pow(2,i);
					sb.insert(0,Math.pow(2,i)+" ");
					memo[i]  = true;
				}
			}
			out.println(sb.delete(sb.length()-1,sb.length()));
		}
	}
}
