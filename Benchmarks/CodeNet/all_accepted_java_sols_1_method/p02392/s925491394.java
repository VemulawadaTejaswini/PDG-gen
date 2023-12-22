import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
			int a = src.nextInt();
			int b = src.nextInt();
			int c = src.nextInt();

			if((a < b) && (b < c)){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
}
