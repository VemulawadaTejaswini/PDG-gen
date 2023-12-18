import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int sum1=a/b;
		int sum2=a%b;
		double a_1=a;
		double b_1=b;
		double sum3=a_1/b_1;
		
		System.out.println(sum1+" "+sum2+" "+sum3);
	}
}