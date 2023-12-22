import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();

		int r=2*d+1;

		int ans = (n+(r-1))/r;
		System.out.println(ans);
		sc.close();
	}
}
