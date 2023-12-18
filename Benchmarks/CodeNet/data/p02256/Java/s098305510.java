import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int amari;
		while(0 < 1) {
			amari = num1 % num2;
			if(amari == 0) break;
			num1 = num2;
			num2 = amari;
		}
		System.out.println(num2);
		sc.close();
	}	
}
