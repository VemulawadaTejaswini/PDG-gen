import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		for(int i=0;i<n;i++){
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}
		String x = sc.next();
		sc.close();

		int idx = 0;
		for(int i=0;i<n;i++){
			if(x.equals(s[i])){
				idx = i;
			}
		}

		int r = 0;
		for(int i=idx+1;i<n;i++){
			r+=t[i];
		}
		System.out.println(r);
	}
}
