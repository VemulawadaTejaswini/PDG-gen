import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int A1 = sc.nextInt();                
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		
		int B[] = new int[3];
		B[0] = Math.abs(A1 - A2);
		B[1] = Math.abs(A3 - A2);
		B[2] = Math.abs(A3 - A1);
		
		int max = 0;
		for (int i = 0; i< 3; i++) {
			if (max < B[i]) {
				max = B[i];
			}
		}
		System.out.println(B[0]+B[1]+B[2]-max);			
	}	
}
