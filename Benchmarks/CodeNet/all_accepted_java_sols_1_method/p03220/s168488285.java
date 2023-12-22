import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qty = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		double ts[] = new double[qty];
		for(int i = 0; i < qty; i ++) {
			ts[i] = t - sc.nextInt() * 0.006;
		}
		double best = Math.abs(ts[0] - a);
		int index = 0;
		for(int i = 0; i < qty; i ++) {
			if(Math.abs(ts[i] - a) < best) {
				best = Math.abs(ts[i] - a);
				index = i;
			}
		}
		System.out.println(index + 1);
	}
}