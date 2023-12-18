import java.util.*;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String h[]=sc.nextLine().split(" ");
		System.out.println(Integer.parseInt(h[0])>Integer.parseInt(h[1])?"safe":"unsafe");
	}
}