import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next(), b = scanner.next();
		String s = a + b;
		int num = Integer.valueOf(s);
		double sqrt = Math.sqrt(num);
		if((int)sqrt == sqrt){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
