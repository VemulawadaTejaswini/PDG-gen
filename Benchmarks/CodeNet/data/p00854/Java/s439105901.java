import java.util.*;
import java.awt.geom.*;
public class Main {

	//2332 start
	//2339 TLE
	//2351 TLE
	//2359 RE
	//0003 WA
	//0005 TLE
	//0006 TLE
	//0008 TLE
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if((n|m|k) == 0) break;
			LinkedList<Integer> stones = new LinkedList<Integer>();
			for(int i = 0; i < n; i++){
				stones.add(i + 1);
			}
			int removeind = m-1;
			stones.remove(removeind);
			int restnum = n-1;
			if(stones.size() == 1){
				System.out.println(stones.get(0));
				continue;
			}
			
			while(true){
				int i = removeind + k - 1;
				removeind = i % restnum;
				restnum--;
				stones.remove(removeind);
				if(restnum == 1){
					System.out.println(stones.get(0));
					break;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}