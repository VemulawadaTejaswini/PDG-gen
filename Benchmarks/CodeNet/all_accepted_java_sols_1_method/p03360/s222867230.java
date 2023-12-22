import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 0; i < K; i++){
			if(A > B && A > C){
				A = A*2;
			}
			if(B > A && B > C){
				B = B*2;
			}
			if(C > A && C > B){
				C = C*2;
			}
			
			if(A == C && A > B){
				A = A*2;
			}
			if(A == B && A > C){
				A = A*2;
			}
			if(B == C && B > A){
				B = B * 2;
			}
			if(A == B && B == C){
				A = A*2;
			}
		}
		int S = A + B + C;
		System.out.println(S);
	}
}
