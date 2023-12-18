import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		Set<Integer> p = new HashSet<>();
		for(int i=0; i<N; i++) {
			p.add(sc.nextInt());
		}

		int ans = -10000;
		for(int i=-200; i<=200; i++) {
			if(p.contains(i)) {
				continue;
			}

			if(ans == -10000) {
				ans = i;
			}else {
				if(Math.abs(i-X) < Math.abs(ans-X)) {
					ans = i;
				}
			}
		}

		System.out.println(ans);
	}

}
