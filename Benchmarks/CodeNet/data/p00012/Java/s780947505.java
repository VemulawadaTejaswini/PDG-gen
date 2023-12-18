import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static double xp, yp;
	static double point_x[] = new double[3], point_y[] = new double[3];
	static boolean result[] = new boolean[3];
	
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
	
		for(int i=0; i < point_x.length; i++){
			point_x[i] = sc.nextDouble();
			point_y[i] = sc.nextDouble();
		}
		
		xp = sc.nextDouble();
		yp = sc.nextDouble();
		
		return true;
	}
	
	public static void solve(){
		double io;
		
		for(int i=0; i < 3; i++){
			io = (point_x[i%3] - point_x[(i+1)%3]) * (point_y[i%3] - yp) - (point_y[i%3] - point_y[(i+1)%3]) * (point_x[i%3] - xp);
			if(io > 0){
				result[i] = true;
			}
			else if(io < 0){
				result[i] = false;
			}
		}
		
		if((result[0] && result[1] && result[2])||(!result[0] && !result[1] && !result[2])){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}