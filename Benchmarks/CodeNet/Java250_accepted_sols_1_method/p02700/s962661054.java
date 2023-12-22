//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[4];
		for(int i=0;i<4;i++) {
			A[i] = sc.nextInt();
			//System.out.println(A[i]);
		}
		
		while(A[0]>0||A[2]>0) {
			A[2] = A[2]-A[1];
			//System.out.println(A[2]);
			if(A[2]<=0) {
				System.out.println("Yes");
				break;
			}
			A[0] = A[0]-A[3];
			if(A[0]<=0) {
				System.out.println("No");
				break;
			}
			
		}
	}
}
