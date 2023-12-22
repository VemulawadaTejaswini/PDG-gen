import java.util.*;


public class Main{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
  		int count =0;
		a[0]= 0;
		
		
		for(int i=1;i<=n;i++){
			int b = sc.nextInt();
			a[i] = b;
		}
			Arrays.sort(a);
			
			
			for(int j=0;j<n;j++){
				    if(a[j] < a[j+1]){
						count++;
				    }
			}
			
		System.out.println(count);
	}
}