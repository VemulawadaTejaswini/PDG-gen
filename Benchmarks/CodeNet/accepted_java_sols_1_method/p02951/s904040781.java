import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		A = A - (B + C);
		
		if(A < 0){
			A = A * -1;
		}
		else if(A > 0){
			A = 0;
		}
		System.out.println(A);
	}
}