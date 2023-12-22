import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<int[]> inputs = new ArrayList<>();
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) break;
			
			int[] ab = new int[]{a,b};
			inputs.add(ab);
		}
		sc.close();
		
		int cases = 1;
		
		for(int[] ab : inputs) {
			if(ab[0] < ab[1]) {
				System.out.println(ab[0] + " " + ab[1]);
			} else {
				System.out.println(ab[1] + " " + ab[0]);
			}
		}
		
	}

}