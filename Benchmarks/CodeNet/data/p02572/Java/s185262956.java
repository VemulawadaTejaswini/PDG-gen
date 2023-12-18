import java.util.*;
public class Main {
	public static void main(String[] args){
	    int s=0;
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		    int []a=new int[n];
		    for(int i=0; i<n;i++ ) {
         a[i] = sc.nextInt();
      }
		for(int j=0;j<n-1;j++)
		{
		    s=s+a[j]*a[j+1];
		}
		s=s+a[0]*a[n-1];
		System.out.print(s);
	
		
		
	}
}