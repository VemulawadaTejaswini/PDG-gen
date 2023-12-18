import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int on = in[0] * in[1];
		int two = in[2] * in[3];
		
		int res = (on == two) ? on : (on > two) ? on : two;
		
		System.out.println(res);
	}
}
