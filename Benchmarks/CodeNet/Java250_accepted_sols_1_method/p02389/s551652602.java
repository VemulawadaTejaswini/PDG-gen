import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int a, b, menseki ,syu;
		a = sc.nextInt();
		b = sc.nextInt();
		
		menseki = a*b;
		syu = (a * 2) + ( b *2);
		
		System.out.println(menseki + " "  + syu);
		
	}

}