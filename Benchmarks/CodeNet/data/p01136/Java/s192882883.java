import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
			ArrayList<HashSet<Integer>> sche = new ArrayList<HashSet<Integer>>();
			for(int i = 0; i < n; i++){
				list.add(new HashSet<Integer>());
				list.get(i).add(i);
				
				sche.add(new HashSet<Integer>());
				int t = sc.nextInt();
				while(t-- > 0){
					int day = sc.nextInt();
					sche.get(i).add(day);
				}
			}
			boolean flg = true;
			for(int day = 0; day < 31; day++){
				HashSet<Integer> today = new HashSet<Integer>();
				for(int i = 0; i < n; i++){
					if(sche.get(i).contains(day)){
						today.add(i);
					}
				}
				
				for(int hum: today){
					for(int hum2: today){
						list.get(hum).addAll(list.get(hum2));
					}
					if(list.get(hum).size() == n){
						System.out.println(day);
						flg = false;
						break;
					}
				}
				
				if(! flg) break;
				
			}
			
			if(flg) System.out.println(-1);
		}
	}

	

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}