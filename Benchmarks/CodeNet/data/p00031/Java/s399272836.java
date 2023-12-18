import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			int weight = sc.nextInt();
			double temp;
			for (int i=9; i>=0; i++) {
				temp = Math.pow(2,i);
				if (weight >= temp) {
					weight -= temp;
					sb.insert(0,temp+" ");
				}
			}
			out.println(sb.delete(sb.length()-1,sb.length()));
		}
	}
}
