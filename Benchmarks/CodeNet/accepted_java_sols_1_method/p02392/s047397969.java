import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		int a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a < b && b < c){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");	
		}
	}
}