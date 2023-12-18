import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] array, waite;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		int l = sc.nextInt();
		if(l == 0)return false;
		
		array = new long[l];
		waite = new long[l];
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		return true;
	}
	
	static void solve(){
		Arrays.sort(array);
		long res = 0;
		for(int i = 1; i < waite.length; i++){
			waite[i] = waite[i-1] + array[i-1];
		}
		for(int i = 0; i < waite.length; i++){			
			res += waite[i];
		}
		System.out.println(res);
	}

}