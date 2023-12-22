import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int planA = N*A;
		int planB = B;
		
		
		if (planA <= planB){
			 System.out.println(planA);	
		}else {
			 System.out.println(planB);
		}
		
		
	}
}