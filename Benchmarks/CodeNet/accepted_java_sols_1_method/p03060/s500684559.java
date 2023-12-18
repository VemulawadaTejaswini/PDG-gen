import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] v = new int[n];
		int[] c = new int[n];
		for(i=0; i<n; i++) {
			v[i] = Integer.parseInt(sc.next());
		}
		int sum=0;
		int xy;
		for(i=0; i<n; i++) {
			xy = v[i] - Integer.parseInt(sc.next());
			if(xy>0)sum+=xy;
		}
		sc.close();
		sc = null;
		System.out.println(sum);
	}
}
