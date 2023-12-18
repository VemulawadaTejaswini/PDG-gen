import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int d;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		d = sc.nextInt();
		return true;
	}
	static void solve(){
		int devide = 0;
		devide = 600 / d;
		int x = 0;
		int y = 0;
		int Sum = 0;
		for(int i = 1; i < devide; i++){
			x = x + d;
			y = x*x;
			Sum = Sum + d*y;
		}
		System.out.println(Sum);

	}

}