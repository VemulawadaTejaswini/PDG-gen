import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = a * b; 
				int r;
					for(;a%b != 0;)
					{
						r = a % b;if(r==0){System.out.println(b +" "+ d/b);break;}
						a = b % r;if(a==0){System.out.println(r +" "+ d/r);break;}
						b = r % a;if(b==0){System.out.println(a +" "+ d/a);break;}
					}
			}
	}
}