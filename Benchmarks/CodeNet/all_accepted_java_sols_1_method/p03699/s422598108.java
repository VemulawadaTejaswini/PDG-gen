import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] points = new int[n];
		int sum = 0;
		
		for(int i=0; i<points.length; i++) {
			points[i] = sc.nextInt();
			sum += points[i];
		}
		sc.close();
		
		Arrays.sort(points);
		
		if(sum%10 != 0) {
			System.out.println(sum);
		}else {
			boolean isprint = false;
			for(int point: points) {
				if(point%10 != 0) {
					System.out.println(sum - point);
					isprint = true;
					break;
				}
			}
			
			if(!isprint) {
				System.out.print(0);
			}
		}
		
		

	}

}