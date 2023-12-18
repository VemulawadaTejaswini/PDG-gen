import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	int [][] freq;
	
	private void doit(){
		freq = new int[4][2];
		while(sc.hasNext()){
			solve();
		}
		for(int i = 0; i < 4; i++){
			System.out.println(freq[i][0] + " " + freq[i][1]);
		}
	}

	private void solve() {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int res = judge(a);
		freq[res][0]++;
		res = judge(b);
		freq[res][1]++;
	}

	private int judge(double a) {
		if(a >= 1.1){
			return 0;
		}
		else if(a >= 0.6){
			return 1;
		}
		else if(a >= 0.2){
			return 2;
		}
		return 3;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}