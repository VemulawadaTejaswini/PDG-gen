import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		if(a<= 599 && a>= 400)
		{
			System.out.println(8);
		}
		else if(a<= 799 && a>= 600)
		{
			System.out.println(7);
		}
		else if(a<= 999 && a>= 800)
		{
			System.out.println(6);
		}
		else if(a<= 1199 && a>= 1000)
		{
			System.out.println(5);
		}
		else if(a<= 1399 && a>= 1200)
		{
			System.out.println(4);
		}
		else if(a<= 1599 && a>= 1400)
		{
			System.out.println(3);
		}
		else if(a<= 1799 && a>= 1600)
		{
			System.out.println(2);
		}
		else if(a<= 1999 && a>= 1800)
		{
			System.out.println(1);
		}
		
	}

}