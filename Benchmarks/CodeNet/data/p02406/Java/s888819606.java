import java.util.Scanner;

class Main{

/*	static boolean EndChk(int i, int n)
	{
		System.out.printf(" %d", i++);

		return ( (i<=n) ? true: false);
	}*/

	static int Include3(int x,int i)
	{
		while(x != 0)
		{
			if(x%10 == 3)
			{
				System.out.printf(" %d", i);
				break;
			}
			else
			{
				x = x/10;//goto EndChk
			}
		}

		return x;
	}

	public static void main(String[] args) {

		int n,i=1,x;

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		while(i <= n)
		{
			x = i;

			if(x%3 == 0)
			{
				System.out.printf(" %d", i);
			}
			else
			{
				x = Include3(x,i);//x???10??§?????£????????????3??????????????????0?????????
			}

			i++;
		}

		System.out.println();

	scan.close();
	}
}