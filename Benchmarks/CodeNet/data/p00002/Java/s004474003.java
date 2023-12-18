import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int keta = String.valueOf(a+b).length();
		
		System.out.println(keta);
	}
}