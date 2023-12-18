import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i = 0;
		int x = 0;

		while((x = in.nextInt()) != 0){
			i++;
			System.out.println("Case " + i + ": " + x);
		}
	}
}