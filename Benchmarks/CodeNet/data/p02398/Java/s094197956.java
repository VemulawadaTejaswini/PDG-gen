import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		for (int i=a; i<=b; i++) {
			if (i%c==0) {ans++;}
		}
		System.out.println(ans);
	}
}

