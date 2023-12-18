import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();

		List<Long> list = new ArrayList<Long>();
		long result = 1;

		for(int i = 0; i < N; i++) {
			list.add(sc.nextLong());
			result = Math.abs(result * list.get(i));
		}
	
		if(result > (long)Math.pow(10, 18)) {
			result = -1;
		}

		System.out.println(result);

	}
}