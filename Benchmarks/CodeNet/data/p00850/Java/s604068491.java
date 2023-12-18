import java.util.*;

public class Main{
	
	int ans, n;
	int [] close ;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> init = new HashSet<Integer>();
		init.add(1);
		close = new int[1024];
		Arrays.fill(close, 1 << 24);
		close[1] = 0;
		solve(1, 0, init);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			System.out.println(close[n]);
		}
	}
	
	private void solve(int now, int step, HashSet<Integer> record) {
		if(step == 13){
			return ;
		}
		for(int value: record){
			for(int i = -1; i <= 1; i+= 2){
				int next = now + value * i;
				if(next <= 0) continue;
				if(record.contains(next)) continue;
				if(next < 1024){
					if(close[next] < step + 1){
						continue;
					}
					close[next] = step + 1;
				}
				HashSet<Integer> nextr = new HashSet<Integer>(record);
				nextr.add(next);
				solve(next, step + 1, nextr);
			}
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}