import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int ans = 0;
		for (int i=0; i<n; i++){
			int a = Integer.parseInt(sc.next());
			while (a%2 == 0 && a != 0){
				a /= 2;
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}