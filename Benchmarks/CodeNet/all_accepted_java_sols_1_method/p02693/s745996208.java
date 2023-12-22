import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=k;
		int flag=0;
		
		while(c<=b){
			
			if(a<=c && c<=b){
				System.out.println("OK");
				System.exit(0);
				
			}
			c+=k;
			
		}
		//System.out.println(c);
		System.out.println("NG");
		
		

		
	}
	
}
