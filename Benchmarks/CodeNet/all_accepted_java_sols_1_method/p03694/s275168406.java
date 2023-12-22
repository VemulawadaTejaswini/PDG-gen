import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] ds = new int[n];
		
		for(int i=0; i<ds.length; i++) {
			ds[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(ds);
		
		System.out.println(ds[n-1] - ds[0]);

	}

}
