import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int y = Y / 2;
		int Turu = y - X;
		if(Turu > X) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		sc.close();

	}

}