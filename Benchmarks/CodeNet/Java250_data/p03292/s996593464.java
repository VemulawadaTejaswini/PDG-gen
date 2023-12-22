import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		
		int A12 = Math.abs(A1 - A2);
		int A13 = Math.abs(A1 - A3);
		int A23 = Math.abs(A2 - A3);
		int cost = Math.min(Math.min(A12 + A23, A13 + A23), A12 + A13);
		System.out.println(cost);
	}
}