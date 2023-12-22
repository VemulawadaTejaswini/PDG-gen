import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = n;
		if(n % 2 == 1) {
			ans--;
		}
		ans = ans / 2;
		ans = 1 - (ans / n);
		System.out.println(ans);
	}

}

