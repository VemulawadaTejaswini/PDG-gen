import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] W=new int[N];
		for(int i=0;i<N;i++) {
			W[i]=sc.nextInt();
		}
		int min=0;
		
		
		
		for(int i=1;i<N;i++) {
			int S1=0;
			int S2=0;
			
			for(int j=0;j<i;j++) {
				S1+=W[j];
			}
			
			for(int k=i;k<N;k++) {
				S2+=W[k];
			}
			
			
			if(i==1) {
				min=Math.abs(S2-S1);
			}else {
				if(Math.abs(S2-S1)<min) {
					min=Math.abs(S2-S1);
				}
			}
		}
		
		
		System.out.println(min);
		
		
		
	}

	
}