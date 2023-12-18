import java.util.*;


public class Main {

	static Scanner sc = new Scanner(System.in);

	static int max;


	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}

	public static Boolean read(){
		if(!sc.hasNextInt())  return false;
		max = sc.nextInt();
		return true;
	}


	public static void solve(){
		Set<Integer> set = new LinkedHashSet<Integer>();

		for(int i=2; i<=max; i++){
			set.add(i);
		}

		for(int i=2; i<=max; i++){
			int n = i;
			int x = 2;
			while(n*x <= max){
				set.remove(n*x);
				x++;
			}
		}

		System.out.println(set.size());

	}

}