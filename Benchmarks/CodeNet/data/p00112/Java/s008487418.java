import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] array, waite;
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
		solve();
	}
	
	static boolean read(){
		int n = sc.nextInt();
		if(n == 0)return false;
		
		array = new long[n];
		waite = new long[n];
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		Arrays.sort(array);
		int res = 0;
		for(int i = 1; i < waite.length; i++){
			waite[i] = waite[i-1] + array[i-1];
		}
		for(int i = 0; i < waite.length; i++){
			//System.out.print(waite[i] + " ");
			res += waite[i];
		}
		
		System.out.println(res);
	}

}