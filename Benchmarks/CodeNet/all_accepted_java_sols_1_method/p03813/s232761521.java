import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x < 1200 ){
			System.out.println("ABC");
		}else{
			System.out.println("ARC");
		}
	}
}