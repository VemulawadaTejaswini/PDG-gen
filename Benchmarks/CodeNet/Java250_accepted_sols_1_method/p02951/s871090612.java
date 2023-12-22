import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		int ans = c - (a - b);
      	if(c < (a - b))ans = 0;
		System.out.println(ans);
	}
}
