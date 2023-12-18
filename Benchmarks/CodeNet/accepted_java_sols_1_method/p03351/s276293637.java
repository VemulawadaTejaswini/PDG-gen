import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		String ans="null";

		if(Math.abs(a-c)>d && Math.abs(b-a)<=d && Math.abs(c-b)<=d) ans="Yes";
		else if(Math.abs(a-c)<=d) ans="Yes";
		else ans="No";		

		System.out.println(ans);
	}
}