import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		while(sc.hasNext()){
			solve();
		}
	}

	private void solve() {
		int n = sc.nextInt();
		int [] freq = new int[6];
		for(int i = 0; i < n; i++){
			double weight = sc.nextDouble();
			boolean flg = false;
			for(int j = 0; j <= 4; j++){
				if(weight < 165.0 + (5 * j)){
					freq[j]++;
					flg = true;
					break;
				}
			}
			if(! flg){
				freq[5]++;
			}
		}
		for(int i = 0; i < 6; i++){
			System.out.print((i + 1) + ":");
			for(int j = 0; j < freq[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}