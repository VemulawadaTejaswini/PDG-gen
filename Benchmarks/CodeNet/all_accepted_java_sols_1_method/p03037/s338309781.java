import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ansL = 1;
		int ansR = sc.nextInt();
		int M = sc.nextInt();
		for(int i = 0; i < M ; i++){
			ansL = Math.max(ansL,sc.nextInt());
			ansR = Math.min(ansR,sc.nextInt());
		}
		sc.close();
		System.out.println(Math.max(0,ansR-ansL+1));
	}
};

