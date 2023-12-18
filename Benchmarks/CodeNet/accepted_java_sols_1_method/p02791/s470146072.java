import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] P = new int[N];
			
			for(int i = 0;i<N;i++) {
				P[i] =scan.nextInt();
			}
			
			int count = 1;
			int min = P[0];	
			
			
			
			
			
			if(N==1) {
				System.out.println(1);
			}else {
			for(int i = 0;i<N-1;i++) {
				
				if(P[i]>P[i+1]&&min>=P[i+1]){//次の数字が小さくて、最小値以下ならおｋ
					min = P[i+1];//最小値更新
					count+=1;
				}				
			}
			
			
			
			
			System.out.println(count);
			}
			
		}
		
		
	}
		

}
