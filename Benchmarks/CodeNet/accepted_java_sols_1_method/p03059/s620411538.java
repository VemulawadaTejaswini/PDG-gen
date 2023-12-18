import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int A = list[0];
		int B = list[1];
		int T = list[2];
		int result=0;
		
		result = (int) ((T+0.5)/A)*B;
		
		System.out.println(result);
	}
}
