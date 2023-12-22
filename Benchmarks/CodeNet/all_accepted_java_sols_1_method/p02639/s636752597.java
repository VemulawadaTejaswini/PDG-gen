import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int input1 = Integer.parseInt(scanner.next());
		int input2 = Integer.parseInt(scanner.next());
		int input3 = Integer.parseInt(scanner.next());
		int input4 = Integer.parseInt(scanner.next());
		int input5 = Integer.parseInt(scanner.next());
		
		if(input1 ==0) {
			System.out.println("1");
		}else if(input2 == 0) {
			System.out.println("2");
		}else if(input3 == 0) {
			System.out.println("3");
		}else if(input4 == 0) {
			System.out.println("4");
		}else if(input5 == 0) {
			System.out.println("5");
		}
		scanner.close();
	}
}
