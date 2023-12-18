import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		int flag = 0;
		
		for(int count = K;count > 0;count--){
			if(flag == 0){
				if(A % 2 == 1 || A == 1){
					A = A - 1;
				}
				B = B + A / 2;
				A = A - A / 2;
				flag = 1;
			}else{
				if(B % 2 == 1 || B == 1){
					B = B - 1;
				}
				A = A + B / 2;
				B = B - B / 2;
				flag = 0;
			}
		}
		
		
		
		
		
		System.out.println(A+" "+B);
	}
}
