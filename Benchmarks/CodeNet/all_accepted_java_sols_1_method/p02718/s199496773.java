//package ABC;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int all=0;
		int[] a =new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			all=all+a[i];
		}
		//System.out.println(all);
		
		double min=1.0 * all/(m*4);
		//System.out.println(min);
		
		int check=0;
		for(int i=0;i<n;i++){
			if(a[i]>=min){
				check++;
				
			}
		}
		//System.out.println(check);
		if(check<m){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		
	}
	
}
