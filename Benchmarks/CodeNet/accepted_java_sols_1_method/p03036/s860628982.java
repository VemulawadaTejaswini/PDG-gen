import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int m=0,n=0;
		m=a*c-b;
		System.out.println(m);
		for(int i=1;i<10;i++){
         n=m;
        m=a*n-b;
         System.out.println(m);		
		}
	}
}