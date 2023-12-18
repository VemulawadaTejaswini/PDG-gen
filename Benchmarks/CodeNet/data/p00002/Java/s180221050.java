import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception{
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt(),b=cin.nextInt();
		int i,c=a+b;
		for(i = 1; (c/10) != 0; i++)
			c = c / 10;
		System.out.println(i);
	}
}