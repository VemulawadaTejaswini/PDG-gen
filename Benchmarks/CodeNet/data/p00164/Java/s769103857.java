import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		while(true){
			int n = sc.nextInt();
			if(n ==0)break;
			int [] data = new int[n];
			for(int i =0 ; i < n; i++){
				data[i] = sc.nextInt();
			}
			StringBuilder ans = new StringBuilder();
			int num = 32;
			int ind = 0;
			for(int i = 0;;i++){
				if(i % 2 == 0){
					int now = (num - 1) % 5;
					num -= now;
				}
				else{
					num -= data[ind % n];
					ind++;
				}
				if(num < 0) num = 0;
				ans.append(num + "\n");
				if(num == 0) break;
			}
			System.out.print(ans.toString());
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}