import java.util.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int ans = 0;			
		int search = d * 2 + 1;
		
		ans = n / search;
		if (n % search > 0)
		ans++;
		out.println(ans);
	}
}