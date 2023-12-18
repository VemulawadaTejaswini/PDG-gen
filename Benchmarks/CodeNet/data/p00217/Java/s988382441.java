import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	private void doit() {
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][] data = new int[n][2];
			for(int i = 0 ; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt() + sc.nextInt();
			}
			
			int max = 0;
			int ind = -1;
			for(int i = 0 ; i < n; i++){
				if(max < data[i][1]){
					max = data[i][1];
					ind = i;
				}
			}
			System.out.println(data[ind][0] + " " + max);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}