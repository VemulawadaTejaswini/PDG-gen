import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int d = stdIn.nextInt();
		int e = stdIn.nextInt();
		int minPasta = a;
		if(minPasta > b)
		{
			minPasta = b;
		}
		if(minPasta > c)
		{
			minPasta = c;
		}
		int minJuice = d;
		if(minJuice > e)
		{
			minJuice = e;
		}
		System.out.println(minPasta + minJuice - 50);
	}
}