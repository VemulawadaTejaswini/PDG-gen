import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int n, m;
	public static void main(String[] args) {
		makeList();
		while(read()){
			solve();
		}
	}
	
	static void makeList(){
		list.add(2);
		list.add(3);
		list.add(5);
		int now = list.get(0);
		int index = 0;
		while( now <= 1000000 ){
			if( !list.contains(now*2) )list.add(now*2);
			if( !list.contains(now*3) )list.add(now*3);
			if( !list.contains(now*5) )list.add(now*5);
			index++;
			now = list.get(index);
		}
		Collections.sort(list);
	}
	
	static boolean read(){
		m = sc.nextInt();
		if( m == 0 )return false;
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = m; i <= n; i++){
			if( list.contains(i) ) res++;
		}
		System.out.println(list.contains(m) ? res : res+1);
	}

}