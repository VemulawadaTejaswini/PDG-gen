import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0)	break;
				int[] p=new int[n];
				int[] plu=new int[n-1];
				long plength=0, ans=0;
				for(int i=0; i<n; i++) {
					p[i]=sc.nextInt();
					plength+=p[i];
				}
				for(int i=0; i<n-1; i++) {
					plu[i]=sc.nextInt();
				}
				Arrays.sort(plu);
				ans=plength*n;
				for(int i=n-2; i>=0; i--) {
					plength+=plu[i];
					if(ans<plength*(i+1))	ans=plength*(i+1);
					else	break;
				}
				System.out.println(ans);
			}
			
		}
	}	
}
