import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	int nap[];
	int target = 10;
	TreeSet<int[]> set;
	HashMap<Integer, Integer> map;
	
	/**
	 * setの初期化をします。
	 */
	void hoge(){
		set=new TreeSet<int[]>(new Comparator<int[]>(){
			@Override
			public int compare(int[] is1, int[] is2) {
				// ひかく
				if(is1.length == is2.length){
					for(int i=0; i<is1.length; ++i){
						if(is1[i] > is2[i]){
							return 1;
						}else if(is1[i] < is2[i]){
							return -1;
						}
					}
					
					return 0;
				}else if(is1.length > is2.length){
					return 1;
				}else{
					return -1;
				}
			}
		});
	}
	
	void dfs(int g, int depth, int index, ArrayList<Integer> v){
		if(g==target){
			if(!map.containsKey(depth)){
				map.put(depth, 0);
			}
			int[] list = new int[v.size()];
			for(int i=0; i<v.size(); ++i){
				list[i] = v.get(i);
			}
			if(set.add(list)){
				map.put(depth, map.get(depth)+1);
			}
		}
		for(int i=index; i<nap.length; ++i){
			int tmp = nap[i];
			if(10<g+tmp){break;}	//sortしたから
			v.add(tmp);
			dfs(g+tmp, depth+1, i+1, v);
			v.remove(v.size()-1);
		}
	}
	
	int solve(){
		map = new HashMap<Integer, Integer>();
		dfs(0, 0, 0, new ArrayList<Integer>());
		int max = 0;
		int count=0;
		for(int i=0; count<map.size(); ++i){
			if(map.containsKey(i)){
				++count;
				int size = map.get(i);
				if(max < size){
					max = size;
				}
			}
		}
		return max;
	}
	
	void io(){
		java.util.Scanner sc = new Scanner(System.in);
		while(true){
			final int n = sc.nextInt();
			if(n==0){ break; }
			nap = new int[n];
			hoge();
			for(int i=0; i<n; ++i){
				nap[i] = sc.nextInt();
			}
			Arrays.sort(nap);
			System.out.println(solve());
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}