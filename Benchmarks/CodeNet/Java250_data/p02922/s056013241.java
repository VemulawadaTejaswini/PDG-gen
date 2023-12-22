import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		int plug = 1;
		for(;;){
			if (plug >= b) break;
			plug = plug + a - 1;
			cnt++;
		}
		out.println(cnt);
	}
}