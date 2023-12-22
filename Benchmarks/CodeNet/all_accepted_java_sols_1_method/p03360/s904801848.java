import java.util.*;

public class Main {

	public static void main(String[] args) {
		// greedy algorithm
		Scanner sc = new Scanner(System.in);

		int max;
		int a = sc.nextInt();
		max = a;

		int b = sc.nextInt();
		if (b > max)
			max = b;

		int c = sc.nextInt();
		if (c > max)
			max = c;
		int k = sc.nextInt();


	int result = 0;
	
	if(max==a) result = (int) (b+c+a*Math.pow(2, k));
	if(max==b) result = (int) (a+c+b*Math.pow(2, k));
	if(max==c) result = (int) (b+a+c*Math.pow(2, k));
		

		
		System.out.println(result);

	}
}
