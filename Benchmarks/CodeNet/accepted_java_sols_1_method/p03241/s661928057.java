import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int x = M / N;
		while(M % x != 0)
			x -= 1;
		System.out.println(x);
	}

}