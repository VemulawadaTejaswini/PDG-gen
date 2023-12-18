import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int M1 = Integer.parseInt(sc.next());
			double result = Math.ceil(M1/1.08);
			double res = Math.floor(result*1.08);
			if(M1 == (int)res) {
				System.out.println((int)result);
			}else {
				System.out.println(":(");
			}
		}
	}
}