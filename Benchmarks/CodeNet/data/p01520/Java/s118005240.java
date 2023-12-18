import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int t = sc.nextInt();
			int e = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int ans = -1;
			for(int i = 0; i <n; i++){
				int x = data[i];
				for(int j = 1;; j++){
					int value = x * j;
					if(value > e + t) break;
					if(t - e <= value && value <= t + e){
						ans = i + 1;
						break;
					}
				}
				if(ans >= 0) break;
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}