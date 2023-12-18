import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			long N = Integer.parseInt(sc.next());
			long ans = 1;
			for(int i=0;i<N;i++) {
				ans *= Integer.parseInt(sc.next());
			}
			if(10e18>=ans) {
				System.out.print(ans);
			}else {
				System.out.println(-1);
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(-1);
		}
		sc.close();
	}
}