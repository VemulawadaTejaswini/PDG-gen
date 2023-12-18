import java.util.*;
import java.awt.geom.*;
public class Main {

	//2332 start
	//2339 TLE
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if((n|m|k) == 0) break;
			ArrayList<Integer> stones = new ArrayList<Integer>();
			for(int i = 0; i < n; i++){
				stones.add(i + 1);
			}
			int removeind = m-1;
			stones.remove(removeind);
			int step = k - 1;
			int restnum = n-1;
			
			for(int i = removeind + 1;; i++){
				step--;
				if(step == 0){
					removeind = i % stones.size();
					restnum--;
					if(restnum == 0){
						System.out.println(stones.get(removeind));
						break;
					}
					stones.remove(removeind);
					step = k - 1;
					i = removeind;
					
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}