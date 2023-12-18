import java.util.*;
public class Main {
	//0010 start
	//0051 sample match
	int m,c,n;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			m = sc.nextInt();
			c = sc.nextInt();
			n = sc.nextInt();
			if((m|c|n) == 0) break;
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> store = new ArrayList<ArrayList<Integer>>();
			for(int i = 0 ; i < m + 1; i++){
				store.add(new ArrayList<Integer>());
			}
			int maxk = 0;
			for(int i = 0 ; i < n; i++){
				int k = sc.nextInt();
				maxk = Math.max(maxk, k);
				list.add(new ArrayList<Integer> ());
				for(int j = 0 ; j < k; j++){
					int b = sc.nextInt();
					list.get(i).add(b);
					store.get(m).add(b);
				}
			}
			int sum = 0;
			int [] res = new int[10];
			for(int i = 0 ; i < maxk; i++){
				for(int j = 0 ; j < n; j++){
					if(list.get(j).size() <= i) continue;
					int num = list.get(j).get(i);
					res[0] = find(store, num);
					sum += res[0];
					
					res[1] = put(store, num);
					sum += res[1];
					if(res[1] != 1){
						int num2 = store.get(0).get(0);
						sum++;
						res[2] = put(store, num2);
						sum += res[2];
						store.get(0).remove(0);
						
						res[3] = find(store, num);
						sum += res[3];
						res[4] = put(store, num);
						sum += res[4];
					}
				}
			}
			System.out.println(sum);
		}
	}
	
	private int put(ArrayList<ArrayList<Integer>> store, int num) {
		for(int i = 0 ; i < store.size(); i++){
			if(store.get(i).size() < c || i == store.size()-1){
				store.get(i).add(num);
				return i+1;
			}
		}
		return -1;
	}

	private int find(ArrayList<ArrayList<Integer>> store, int num) {
		for(int i = 0 ; i < store.size(); i++){
			for(int j = 0; j < store.get(i).size(); j++){
				if(store.get(i).get(j) == num){
					store.get(i).remove(j);
					return i + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}