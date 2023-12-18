
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] a = new int[n];
						
			for (int i = 0; i < a.length; i++) 
				a[i]=s.nextInt();
			Arrays.sort(a);
			int res = 0;
			int i=1;
			
			for(int j=n-1;j>=0;j--){
				res+=a[j]*i;
				i*=-1;
			}
			
			System.out.println(res);
			
			s.close();
		}		
}