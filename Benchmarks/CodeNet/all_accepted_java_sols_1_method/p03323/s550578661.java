import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();

		System.out.println(a<=8 && b<=8 ?"Yay!":":(");
	}
}