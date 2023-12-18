import java.util.*;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int n, m;
	static ArrayList<Integer> height, width;
	public static void main(String[] args) {
		while( read() ){
			solve();
		}
	}
	
	static boolean read(){
		n = scanner.nextInt();
		m = scanner.nextInt();
		if( n == 0 && m == 0 ) return false;
		height = new ArrayList<Integer>();
		width = new ArrayList<Integer>();
		for( int i = 0; i < n; i++ ){
			height.add(scanner.nextInt());
		}
		for( int i = 0; i < m; i++ ){
			width.add(scanner.nextInt());
		}
		return true;
	}
	
	static void solve(){
		int ans = 0;
		addNextStreet(height, n);
		addNextStreet(width, m);
		for(int i = 0; i < height.size(); i++){
			for(int j = 0; j < width.size(); j++){
				if( height.get(i) == width.get(j) ) ans++; 
			}
		}
		System.out.println(ans);
	}
	
	static void addNextStreet(ArrayList<Integer> list, int num){
		for(int i = 0; i < num; i++){
			int sum = list.get(i);
			for(int j = i+1; j < num; j++){
				sum += list.get(j);
				list.add(sum);
			}
		}
	}
}