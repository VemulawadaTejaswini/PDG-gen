import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c= scanner.nextInt();
		if(a + b+ c > 21) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
		scanner.close();
	}

}