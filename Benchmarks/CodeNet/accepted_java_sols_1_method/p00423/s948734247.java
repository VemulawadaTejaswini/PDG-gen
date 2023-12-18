import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			
			int n = sc.nextInt();
			if(n==0) {
				sc.close();
				break;
				
			}
			
			int[] a = new int[n];
			int[] b = new int[n];
			Arrays.fill(a, 0);
			Arrays.fill(b, 0);
			
			int a_score=0;
			int b_score=0;
			
		
			for(int i=0; i<n; i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
		
			
		
			for(int i=0; i<n; i++){
				if(a[i] > b[i]){
					a_score += a[i]+b[i];
				}else if(a[i] == b[i]){
					a_score += a[i];
					b_score += b[i];
				}else{
					b_score += a[i]+b[i];
				}
			}
			
			System.out.println(a_score + " " + b_score);

		}
		
	}

}