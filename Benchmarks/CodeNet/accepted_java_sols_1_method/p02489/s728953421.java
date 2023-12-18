import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int num, i = 0;
			while((num = sc.nextInt()) != 0){
				System.out.println("Case " + ++i + ": " + num);
			}
		}
	}
}