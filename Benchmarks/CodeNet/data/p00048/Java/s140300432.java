import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double n = sc.nextDouble();
			System.out.println(judge(n));
		}
	}
	
	
	private String judge(double n) {
		if(n <= 48.00){
			return "light fly";
		}
		if(n <= 51.00){
			return "fly";
		}
		if(n <= 54){
			return "bantam";
		}
		if(n <= 57){
			return "feather";
		}
		if(n <= 60){
			return "light";
		}
		if(n <= 64){
			return "light welter";
		}
		if(n <= 69){
			return "welter";
		}
		if(n <= 75){
			return "light middle";
		}
		if(n <= 81){
			return "middle";
		}
		if(n <= 91){
			return "light heavy";
		}
		else{
			return "heavy";
		}
	}


	public static void main(String [] args){
		new Main().doit();
	}
}