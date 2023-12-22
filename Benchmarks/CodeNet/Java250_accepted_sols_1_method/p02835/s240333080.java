import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A1=scan.nextInt();
		int A2=scan.nextInt();
		int A3=scan.nextInt();
		int sum=0;
		sum=A1+A2+A3;
		if(sum>=22)
		{
			System.out.println("bust");
		}
		else
		{
			System.out.println("win");
		}

	}

}
