import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//1019
	static class VampirishNight {
		void print_solution() {
			for(;;) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				if(n == 0 && k == 0) break;
				int[] s = new int[k];
				for(int i=0; i<k; i++) {s[i] = sc.nextInt();}

				String ans = "Yes";
				for(int i=0; i<n; i++) {
					for(int j=0; j<k; j++) {
						s[j] -= sc.nextInt();
						if(s[j] < 0) ans = "No";
					}
				}
				System.out.println(ans);
			}
		}
	}

	public static void main(String[] args) {
		VampirishNight vn = new VampirishNight();
		vn.print_solution();
	}
}