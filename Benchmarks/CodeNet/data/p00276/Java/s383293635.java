import java.util.*;
				
public class mon6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int R = 0;
		R = scan.nextInt();
		for(int k = 1;k<=R;k++){
			int count = 0;
			int C = scan.nextInt();
			int A = scan.nextInt();
			int N = scan.nextInt();
			while(true){
				if(N != 0 && A != 0 && C != 0){
					count = count + 1;
					C = C - 1;
					A = A - 1;
					N = N - 1;
				}else
				if(A != 0 && C >= 2){
					count = count + 1;
					C = C - 2;
					A = A - 1;
				}else
				if(C >= 3){
					count = count + 1;
					C = C - 3;
				}else
				if(C <= 2){
					break;
				}
			}
				System.out.println(count);
		}
	}
}