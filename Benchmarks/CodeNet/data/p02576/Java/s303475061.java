import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();

		int times = (int) Math.ceil(N/X);

		System.out.println(T*times);
		return;
	}

}
