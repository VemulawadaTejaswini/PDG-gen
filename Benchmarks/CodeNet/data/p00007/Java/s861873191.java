import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int n;
		int money = 100000;
		
		n = stdIn.nextInt();
		for (int i = 0; i < n; i++){
			money *= 1.05;
			if (money % 1000 != 0){
				money /= 1000;
				money *= 1000;
				money += 1000;
			}
		}
		System.out.println(money);
	}
}