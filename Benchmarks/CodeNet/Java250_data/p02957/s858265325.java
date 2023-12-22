import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a+b)%2==0) {
			out.println((a+b)/2);
		}
		else out.println("IMPOSSIBLE");
		sc.close();
	}
}