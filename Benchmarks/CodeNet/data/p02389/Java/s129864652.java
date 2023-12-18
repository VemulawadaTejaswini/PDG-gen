import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int a,b,menseki,shu;
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	b=scan.nextInt();
	menseki=a*b;
	shu=2*a+2*b;
	System.out.println(menseki+" "+shu);
    }
}