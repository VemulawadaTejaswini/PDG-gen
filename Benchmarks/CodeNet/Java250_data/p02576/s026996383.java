import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int t=sc.nextInt();
		if(n%x==0)
			System.out.println((t*(n/x)));
		else 
			System.out.println(t*((n/x)+1));
	}
}