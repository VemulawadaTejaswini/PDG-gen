import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.start();
		

	}
	private void start(){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d %d\n", a * b, (a + b) * 2);
	}

}