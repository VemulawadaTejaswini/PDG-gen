import java.util.Scanner;

public class Main{
	public static void main(String [] args)
	{
		Scanner stdin = new Scanner (System.in);
		System.out.print("Enter Numbe a ============= ");
		int num = stdin.nextInt();
		int result = 0;
		if(num >= 1 && num <= 1000 ){
				result = num*num*num;
		}
		System.out.println(result);
	}
}