import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
	Scanner sc1 = new Scanner(System.in);
	int S = sc1.nextInt();
	int h = S / 3600;
	int m = (S-h*3600) / 60;
	int s = S % 60;
	System.out.println(h+":"+m+":"+s);
	}
}

