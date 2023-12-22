import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		
		if((Math.max(A,B)-Math.min(A,B))%2 == 0) {
			System.out.println((Math.max(A,B)+Math.min(A,B))/2);
		}
		else {
			System.out.println("IMPOSSIBLE");
		}

	}

}