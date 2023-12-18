import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static double steps, angle, total_angle = 0, x = 0, y = 0;
	static String str[];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}
		
		System.out.println((int)x);
		System.out.println((int)y);

	}
	
	public static boolean read(){
		
		str = sc.next().split(",");
		
		steps = Integer.parseInt(str[0]);
		angle = Integer.parseInt(str[1]);
		
		if(steps == 0 && angle == 0) return false;
		
		return true;
	}
	
	public static void solve(){
		
		x += steps * Math.sin(total_angle * Math.PI / 180);
		y += steps * Math.cos(total_angle * Math.PI / 180);
		
		if(angle < 0) angle += 360;
		total_angle = (total_angle + angle) % 360;
		
	}

}