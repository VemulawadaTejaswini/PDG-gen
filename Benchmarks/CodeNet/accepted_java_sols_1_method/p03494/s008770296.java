import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		int count = 0;
		out: while(count >= 0) {
			for(int i = 0; i < A.length; i++) {
				if(A[i] % 2 == 0) {
					A[i] /= 2;
				}else{
					break out;
				}
			}
			count++;
		}
		System.out.println(count);
		
	}

}