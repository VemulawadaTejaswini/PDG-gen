import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max= 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int a  = sc.nextInt();
			sum += a;
			if (max < a) {
				max = a;
			}
		}
		System.out.println(sum + 9 * max);
	}
	
	
}