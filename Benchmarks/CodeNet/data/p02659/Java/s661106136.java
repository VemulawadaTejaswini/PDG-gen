import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		double B = sc.nextDouble();
		
		System.out.println(Math.ceil(A*B));
		
		sc.close();

	}

}