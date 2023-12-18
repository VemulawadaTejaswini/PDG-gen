import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	boolean[] getPrime(final int n){
		boolean[] list = new boolean[n+1];
		for(int i=2; i<=n; ++i){ list[i] = true;}
		for(int i=2; i*i<=n; ++i){
			if(list[i]){
				for(int j=i*2; j<=n; j+=i){
					list[j] = false;
				}
			}
		}
		return list;
	}
	
	int countGoldbach(final boolean[] map){
		int c=0;
		int target = map.length -1;
		if(target%2 == 1)return 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2; i<map.length; ++i){
			if(map[i]){ list.add(i); }
		}
		for(int i=0; i<list.size(); ++i){
			for(int j=i; j<list.size(); ++j){
				if(list.get(i) + list.get(j) == target)++c;
			}
		}
		
		return c;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			final int n = sc.nextInt();
			System.out.println(countGoldbach(getPrime(n)));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
	
	void debug(Object... os){
		System.out.println(Arrays.deepToString(os));
	}
}