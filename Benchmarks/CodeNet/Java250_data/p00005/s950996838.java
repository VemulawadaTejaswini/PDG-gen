import java.util.Scanner;


public class Main{
	
	static Scanner sc = new Scanner(System.in);
	static long a, b, tmp, max, min, mod, x, y;

	public static void main(String[] args) {
		
		while(read()){
			solve_max();
			solve_min();
			System.out.println(max + " " + min);
		}
	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
			
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a < b){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		return true;
	}
	
	public static void solve_max(){
		
		x = a;
		y = b;
		
		while((mod = (x % y)) != 0){
			x = y;
			y = mod;
		}
		
		max = y;
	}
	
	public static void solve_min(){
		min = (a * b) / max;
	}

}