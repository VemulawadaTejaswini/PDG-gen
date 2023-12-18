import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int M = sc.nextInt();
        int N = sc.nextInt();
		if (N % M == 0)System.out.println(N + M);
        else System.out.println(N - M) ;
	}
}
