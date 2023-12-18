import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		
		int D = Math.abs(B-A);
		int S = V-W;
		
		if(S*T < D) {System.out.println("NO");}
		else {System.out.println("YES");}
	}
}