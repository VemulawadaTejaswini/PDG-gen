import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if((n|q) == 0) break;
			int [] freq = new int[101];
			for(int i = 0; i < n; i++){
				int k = sc.nextInt();
				for(int j = 0; j < k; j++){
					freq[sc.nextInt()]++;
				}
			}
			int max = q-1, ind = 0;
			for(int i = 0; i < 101; i++){
				if(max < freq[i]){
					max = freq[i];
					ind = i;
				}
			}
			System.out.println(ind);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}