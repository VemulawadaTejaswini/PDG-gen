import java.util.*;

public class Main{
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			ArrayList<HashSet<Integer>> data = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < k; i++){
				data.add(new HashSet<Integer>());
				int m = sc.nextInt();
				for(int j = 0; j < m; j++){
					data.get(i).add(sc.nextInt());
				}
			}
			HashSet<Integer> badfeel = new HashSet<Integer>();
			int r = sc.nextInt();
			for(int i = 0; i < r; i++){
				int p = sc.nextInt();
				int q = sc.nextInt();
				int pind = -1, qind = -1;
				for(int j = 0; j < data.size(); j++){
					if(data.get(j).contains(p)){
						pind = j;
					}
					if(data.get(j).contains(q)){
						qind = j;
					}
				}
				if(pind == qind){
					badfeel.add(p);
					badfeel.add(q);
				}
			}
			System.out.println(badfeel.size());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}