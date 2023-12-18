import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A  = in.nextInt();
		int B  = in.nextInt();
		int C  = in.nextInt();
		int D  = in.nextInt();

        A = Math.max(A,C);
        B = Math.min(B,D);

        System.out.print(Math.max(0,B-A));
	}
}