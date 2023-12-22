import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int x =  Integer.parseInt(a[1]) ;
		int t =  Integer.parseInt(a[2]);
		int answer = 0;
		while (n > 0) {
			n -= x;
			answer += t;
		}
		System.out.println(answer);
	}

}