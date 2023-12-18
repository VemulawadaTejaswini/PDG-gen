import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){

		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String[] line = new String[2];
			line = sc.next().split(":");
			solve(line);
		}
		return true;
	}
	static void solve(String[] param){
		int hour = Integer.parseInt(param[0]);
		int time = Integer.parseInt(param[1]);
		int longHand = 6*time;
		double shortHand = 30*hour + 0.5*time;
		double diff = Math.abs(longHand - shortHand);
		if(diff > 180)diff = diff - 180;
		if(diff >= 0 && diff <= 30){
			System.out.println("alert");
		}else if(diff >= 90 && diff <= 180){
			System.out.println("safe");
		}else{
			System.out.println("warning");
		}
	}
}