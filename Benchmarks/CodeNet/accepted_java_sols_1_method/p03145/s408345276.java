import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int ab = scanner.nextInt();
		int bc = scanner.nextInt();
		int ca = scanner.nextInt();
		int area = (ab*bc)/2;
		System.out.println(area);

	}
}