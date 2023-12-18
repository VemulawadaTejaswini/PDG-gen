import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		long ans = 1;
		for(int i=0;i<N;i++) {
			ans *= Long.parseLong(sc.next());
		}

		if((long)Math.pow(10, 18)>=ans) {
			System.out.print(ans);
		}else {
			System.out.println(-1);
		}

		sc.close();
	}
}