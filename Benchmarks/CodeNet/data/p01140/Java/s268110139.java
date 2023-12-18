import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int[] n = new int[2];
			MultiSet<Integer>[] set = new MultiSet[2];
			for(int i=0; i<2; i++){
				n[i] = in.nextInt();
				set[i] = new MultiSet<Integer>();
			}
			if(n[0] == 0 && n[1] == 0) break;
			for(int i=0; i<2; i++){
				int[] w = new int[n[i]];
				for(int j=0; j<n[i]; j++){
					w[j] = in.nextInt();
				}
				for(int j=0; j<n[i]; j++){
					int sum = 0;
					for(int k=j; k<n[i]; k++){
						sum += w[k];
						set[i].add(sum);
					}
				}
			}
			long res = 0;
			for(int i: set[0].set.keySet()){
				if(set[1].set.containsKey(i)){
					res += set[0].get(i)*set[1].get(i);
				}
			}
			System.out.println(res);
		}
	}
}

class MultiSet<T>{
	HashMap<T, Integer> set;
	public MultiSet(){
		set = new HashMap<T, Integer>();
	}
	
	public void add(T val){
		if(set.containsKey(val)){
			set.put(val, set.get(val)+1);
		}else{
			set.put(val, 1);
		}
	}
	
	public int get(T val){
		if(set.containsKey(val)) return set.get(val);
		return 0;
	}
}