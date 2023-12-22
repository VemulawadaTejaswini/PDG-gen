import java.util.*;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String []args){
		int n=sc.nextInt();
		int x=sc.nextInt();
		int t=sc.nextInt();
		
		int time=(n/x)*t;
		if(n%x!=0)
			time+=t;
		System.out.println(time);
		
	}
	
}