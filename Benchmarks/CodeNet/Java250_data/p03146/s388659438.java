import java.util.Scanner;

public class Main {

	public static int f(int n) {
		if (n % 2 == 0)
			return n / 2;
		else
			return 3 * n + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		int ans = 1, tmp = s, t = 4;
		if(s == 1 || s == 2) 
			t = s;
		
			while (tmp != t) {
				tmp = f(tmp);
				++ans;
			}
		ans += 3;
		System.out.println(ans);
	}

}
