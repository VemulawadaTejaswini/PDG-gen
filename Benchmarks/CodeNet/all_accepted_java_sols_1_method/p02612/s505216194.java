import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int ans = X % 1000;
		if(ans!=0) ans -= 1000;
		System.out.println(Math.abs(ans));
	}
}
