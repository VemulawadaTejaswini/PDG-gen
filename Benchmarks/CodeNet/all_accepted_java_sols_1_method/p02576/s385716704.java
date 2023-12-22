import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		int times;
		
		if(N%X == 0) {
			times = N/X;
		} else {
			times = N/X + 1;
		}
		System.out.print(times * T);
	}

}