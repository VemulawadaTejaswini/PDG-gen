import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A <= 9 && B <= 9) {
			System.out.println(A*B);
		} else {
			System.out.println(-1);
		}
		
	}

}
