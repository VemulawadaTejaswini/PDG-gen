import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double debt = 100000/1000;
		
		for(int i = 0; i < n; i++) {
			debt = Math.ceil(debt * 1.05);
		}
		
		int result = (int) (debt * 1000);
		System.out.println(result);
	}

}