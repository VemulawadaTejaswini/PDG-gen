import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		String x = Integer.toString(a[0]);
		String y = Integer.toString(a[1]);
		String z = Integer.toString(a[2]);
		int[] b = new int[6];
		b[0] = Integer.valueOf(x+y);
		b[1] = Integer.valueOf(x+z);
		b[2] = Integer.valueOf(y+x);
		b[3] = Integer.valueOf(y+z);
		b[4] = Integer.valueOf(z+x);
		b[5] = Integer.valueOf(z+y);
		Arrays.sort(b);
		System.out.println(b[2]);
	}
}