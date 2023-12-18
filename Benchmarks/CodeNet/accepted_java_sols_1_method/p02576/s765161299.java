
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int t=sc.nextInt();
		
		int k=0;
		
		if(n%x==0)k=n/x;
		else k=((n-n%x)/x)+1;
		
       System.out.println(k*t);

	

	
	}
}
