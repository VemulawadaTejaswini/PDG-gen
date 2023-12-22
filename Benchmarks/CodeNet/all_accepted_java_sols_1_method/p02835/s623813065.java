import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if(a+b+c>=22)
		{
			System.out.println("bust");
		}
		else
		{
			System.out.println("win");
		}
	}
}
