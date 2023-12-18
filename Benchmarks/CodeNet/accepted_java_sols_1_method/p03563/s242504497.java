import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = 0;
		p -= sc.nextInt();
		System.out.println(p + (sc.nextInt() * 2));
	}
}
