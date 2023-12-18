
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x=sc.nextInt();
		int newt=(t+x)%24;
		
		System.out.println(newt);
	}
}
