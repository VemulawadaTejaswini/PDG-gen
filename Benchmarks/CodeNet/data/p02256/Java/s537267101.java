import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] num = str.split(" ",2);
		System.out.println(gcd(Integer.parseInt(num[0]),Integer.parseInt(num[1])));
	}
	private static int gcd(int x, int y)
	{
		int tmp = -1;
		if(x < y)
		{
			tmp = x;
			x = y;
			y = tmp;
		}
		while(tmp != 0)
		{
			tmp = x % y;
			x = y;
			y = tmp;
		}
		return x;
	}
}
