import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int op = a + b;
		if (24 <= op){
			op = op -24;
		}
		System.out.println(op);
	}

}