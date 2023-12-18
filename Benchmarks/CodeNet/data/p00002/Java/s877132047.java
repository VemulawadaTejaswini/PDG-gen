import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a, b, sum;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		a = sc.nextInt(); b = sc.nextInt();
		return true;
	}
	static void solve(){
		sum = a + b;
		String line = Integer.toString(sum);
		System.out.println(line.length());
	}
}