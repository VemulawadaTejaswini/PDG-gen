import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();


		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B  = scan.nextInt();
		
		int x = A+B;
		int y= A-B;
		int z = A*B;
		System.out.println(Math.max(Math.max(x, y), z));

		
	}
}
