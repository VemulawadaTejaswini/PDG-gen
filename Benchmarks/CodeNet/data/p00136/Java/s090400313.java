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
		while(n-- > 0){
			double weight = sc.nextDouble();
			if(weight < 165.0){
				freq[0]++;
			}
			else if(weight < 170.0){
				freq[1]++;
			}
			else if(weight < 175.0){
				freq[2]++;
			}
			else if(weight < 180.0){
				freq[3]++;
			}
			else if(weight < 185.0){
				freq[4]++;
			}
			else{
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