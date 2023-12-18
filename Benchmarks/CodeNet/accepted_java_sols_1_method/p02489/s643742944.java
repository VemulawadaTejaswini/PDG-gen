import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		while(true){
			x = scanner.nextInt();
			if( x==0 )break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}