import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		if(a>b)
			c=a+(a-1);
		else if(a<b)
			c=b+(b-1);
		else c=a+b;
		System.out.println(c);
	}
}