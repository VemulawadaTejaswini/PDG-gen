import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	private void doit() {
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			int [] data = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
				sum += data[i];
			}
			Arrays.sort(data);
			for(int i = n-m; i >= 0; i-= m){
				sum -= data[i];
			}
			System.out.println(sum);
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}