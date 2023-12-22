import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x = sc.nextInt();
		int cnt = 1;
		int value = 0;
		for (int i = 0; i < n; i ++){
			value += sc.nextInt();
			if(value <= x)
				cnt++;
		}
		out.println(cnt);

	}
}