import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			double d = Double.parseDouble(sc.next());
			String s = "";
			
			if(d > 91.00){
				s = "heavy";
			}else if(d > 81.00){
				s = "light heavy";
			}else if(d > 75.00){
				s = "middle";
			}else if(d > 69.00){
				s = "light middle";
			}else if(d > 64.00){
				s = "welter";
			}else if(d > 60.00){
				s = "light welter";
			}else if(d > 57.00){
				s = "light";
			}else if(d > 54.00){
				s = "feather";
			}else if(d > 51.00){
				s = "bantam";
			}else if(d > 48.00){
				s = "fly";
			}else{
				s = "light fly";
			}
			
			System.out.println(s);
		}
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}