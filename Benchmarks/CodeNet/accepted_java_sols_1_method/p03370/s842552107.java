import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int total = 0;
		int[] donut = new int[N];
		int cheapest = Integer.MAX_VALUE;
		for (int i=0; i<N; i++){
			donut[i] = sc.nextInt();
			cheapest = Math.min(cheapest, donut[i]);
			X-=donut[i];
			total++;
		}
		total+=X/cheapest;
		System.out.println(total);
	}

}