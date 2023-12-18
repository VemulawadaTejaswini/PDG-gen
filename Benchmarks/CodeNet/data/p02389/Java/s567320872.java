import java.util.Scanner;
public class Main
{
	public static void main(String[] atgs)
	{
		Scanner scan=new Scanner(System.in);
		
		int tate;
		int yoko;
		int sum1=0;
		int sum2=0;

		int a=scan.nextInt();
		tate=a;
		a=scan.nextInt();
		yoko=a;
		
		sum1=tate*yoko;
		System.out.print(sum1);
		System.out.print(" ");
		sum2=(tate*2)+(yoko*2);
		System.out.print(sum2);
	}
}