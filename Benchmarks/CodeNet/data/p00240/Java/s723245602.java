import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			int year = sc.nextInt();
			int [][] data = new int[n][3];
			int ind = -1;
			double max = 0.0;
			for(int i = 0; i < n; i++){
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
				data[i][2] = sc.nextInt();
				
				double now = 0;
				if(data[i][2] == 1){
					now = 1 + (double)year * data[i][1] / 100;
				}
				else{
					now = 1;
					for(int j = 0; j < year; j++){
						now *= 1 + (double)data[i][1] / 100;
					}
				}
				if(max < now){
					max = now;
					ind = data[i][0];
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