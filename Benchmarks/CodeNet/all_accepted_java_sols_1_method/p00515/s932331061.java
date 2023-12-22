import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] point = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			point[i] = sc.nextInt();
			if(point[i] < 40) {
				point[i] = 40;
			}
			
			sum+=point[i];
		}
		
		int avg = sum / 5;
		
		System.out.println(avg);
	}
}