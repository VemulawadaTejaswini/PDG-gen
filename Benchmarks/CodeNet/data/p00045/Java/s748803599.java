import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int total = 0;
		int num = 0;
		while (sc.hasNext()) {
			String[] temp = sc.next().split(",");
			total += Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
			num++;
		}
		out.println(total);
		out.println(Math.round(total/num));
	}
}
