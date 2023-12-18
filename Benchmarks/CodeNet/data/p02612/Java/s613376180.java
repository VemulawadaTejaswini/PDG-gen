import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		if(n>=9000) ans = 10000-n;
		else if(n>=8000) ans = 9000-n;
		else if(n>=7000) ans = 8000-n;
		else if(n>=6000) ans = 7000-n;
		else if(n>=5000) ans = 6000-n;
		else if(n>=4000) ans = 5000-n;
		else if(n>=3000) ans = 4000-n;
		else if(n>=2000) ans = 3000-n;
		else if(n>=1000) ans = 2000-n;
		else ans = 1000-n;

		if(ans == 1000) System.out.println(0);
		else System.out.println(ans);

	}
}
