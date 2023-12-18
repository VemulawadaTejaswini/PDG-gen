import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int area = 0;

		int A = scan.nextInt();
		int B = scan.nextInt();

		area = (A * B) - (A + B -1);

		System.out.println(area);
	}
}