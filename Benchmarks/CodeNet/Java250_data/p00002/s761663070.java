import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			while(scanner.hasNext()){
				int result = digitNumber(scanner.nextInt(), scanner.nextInt());
				System.out.println(result);
			}
		}
	}
	
	public static int digitNumber(int a, int b){
		return (""+(a+b)).length();
	}
}