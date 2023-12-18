import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	static String check(int num)
	{
		if(num==3) return "bon";
		else if(num==0 || num==1 || num==6 || num==8) return "pon";
		else return "hon";
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num = n%10;
		System.out.println(check(num));
	}
}