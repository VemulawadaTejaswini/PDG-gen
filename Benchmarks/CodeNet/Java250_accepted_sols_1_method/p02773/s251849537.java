import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			String[] S = new String[N];
			int[] count = new int[N];
			
			for(int i=0;i<N;i++) {
				S[i] =scan.next();
				count[i] = 1;
			}
			
			
			Arrays.sort(S);
			
			for(int i = 0;i<N-1;i++) {
				if(S[i].equals(S[i+1])) {
					count[i+1]  =count[i]+1;
				}
				
			}
			
			
			int max = 1;
			for(int i =0;i<N;i++) {
				if(max<count[i]) {
					max = count[i];
				}
			}
			
			for(int i = 0;i<N;i++) {
				if(count[i]==max) {
					System.out.println(S[i]);
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
