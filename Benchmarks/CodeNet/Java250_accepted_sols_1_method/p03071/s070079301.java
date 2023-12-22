import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int Twice1 = (A+(A-1));
		int Twice2 = (B+(B-1));
		int Both = A+B;
		
		int[]Array = new int[3];
		Array[0] = Twice1;
		Array[1] = Twice2;
		Array[2] = Both;
		
		Arrays.sort(Array);
		System.out.println(Array[2]);
	}

}
