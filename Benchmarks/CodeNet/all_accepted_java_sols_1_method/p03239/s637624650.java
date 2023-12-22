import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int min = 0;
		for(int i = 0; i < N; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			if(t <= T) {
				if(min == 0) {
					min = c;
				}else{
					min = Math.min(min, c);
				}
			}
		}

		if(min == 0) {
			System.out.println("TLE");
		}else {
			System.out.println(min);
		}
	}
}
