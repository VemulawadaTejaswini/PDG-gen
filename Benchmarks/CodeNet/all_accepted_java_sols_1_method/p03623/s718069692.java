import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int a = reader.nextInt();
		int b = reader.nextInt();
		int xa = Math.abs(a-x);
		int xb = Math.abs(b-x);
		String ans = "A";
		if (xa > xb) {
			ans = "B";
		}
		System.out.println(ans);


		reader.close();
	}


}



