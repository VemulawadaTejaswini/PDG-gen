import java.util.Scanner;

public class Problem_0002 {
	public static void main(String[] args){
		int a,b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.println((String.valueOf(a+b).length()));
	}
}