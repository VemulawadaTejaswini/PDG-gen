import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int plus		= a+b;
		int minus		= a-b;
		int multiplied	= a*b;

		int result		= 0;

		if(plus > minus){
			if(plus > multiplied){
				result = plus;
			}else{
				result = multiplied;
			}
		}else if(minus > multiplied){
			result = minus;
		}else{
			result = multiplied;
		}

		System.out.println(result);
	}
}