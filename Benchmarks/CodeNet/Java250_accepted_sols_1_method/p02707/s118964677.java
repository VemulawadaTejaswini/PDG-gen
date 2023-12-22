import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] emp = new int[N];
		int A;
		for(int i = 2 ; i < N + 1; i++) {
			A = sc.nextInt() -1;
			emp[A]++; 
		} 
		for(int res : emp) {
			System.out.println(res);
		}
	}
	
}