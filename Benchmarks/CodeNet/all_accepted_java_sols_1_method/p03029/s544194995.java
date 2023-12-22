import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		int flagment = a * 3 + p;
		int applePie = flagment / 2;
		
		System.out.println(applePie);
	}	
}