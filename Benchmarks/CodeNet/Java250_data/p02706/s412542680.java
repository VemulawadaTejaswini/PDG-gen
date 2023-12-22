//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int [M];
		for(int i=0;i<M;i++) {
			A[i] = sc.nextInt();
		}
		int finish = 0;
		for(int j=0;j<M;j++) {
			finish = finish+A[j];
		}
		if(finish>N) {
			System.out.println(-1);
		}else {
			System.out.println(N-finish);
		}
		
	}
}
