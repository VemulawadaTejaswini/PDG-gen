import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double height, max ,min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
		System.out.println(max - min);
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		height = sc.nextDouble();
		return true;
	}
	static void solve(){
		max = Math.max(max, height);
		min =  Math.min(min, height);
	}
}