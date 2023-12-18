import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A = new int[N];
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();
			
			Arrays.sort(A);
			
			int ke = A[0];
			int kenum = 0;
			
			
			while(true) {
			
			
			int count = 0;
			for(int i = 0;i<N;i++) {
				
				if(i==kenum)continue;
				
				if(A[i]==0) { 
					count++;
				}else {
					A[i] = A[i]%ke;
					if(A[i]<ke&&A[i]!=0) {
						ke=A[i];
						kenum=i;
					
					}
				
				}
			}
			
			if(count==N-1)break;
			}
			
			
			System.out.println(ke);
		}
		
		
	}
		
	

}
