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
		String w = Integer.toString(a[3]);
		
		int[] b = new int[12];
		b[0] = Integer.valueOf(x+y);
		b[1] = Integer.valueOf(x+z);
		b[2] = Integer.valueOf(x+w);
		b[3] = Integer.valueOf(y+x);
		b[4] = Integer.valueOf(y+z);
		b[5] = Integer.valueOf(y+w);
		b[6] = Integer.valueOf(z+x);
		b[7] = Integer.valueOf(z+y);
		b[8] = Integer.valueOf(z+w);
		b[9] = Integer.valueOf(w+x);
		b[10] = Integer.valueOf(w+y);
		b[11] = Integer.valueOf(w+z);		
		
		Arrays.sort(b);
		System.out.println(b[2]);
	}
}