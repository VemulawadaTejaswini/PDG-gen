import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int d, x = 600, y = 0, f, current_x, area;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
		
	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		d = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		
		current_x = 0;
		area = 0;
		
		while(current_x < x){
			
			f = current_x * current_x;
			area += f * d;
			
			current_x += d;
		}
		
		System.out.println(area);
	}

}