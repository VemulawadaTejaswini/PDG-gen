import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int N = in.nextInt();
	int ans = 0;

	for(int cnt = 0; cnt < N; cnt++){
		int l = in.nextInt();
		int r = in.nextInt();
		ans = ans + r - l + 1;
	}
	System.out.println(ans);
}
}