import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(kaikyu(sc.nextDouble()));
		}
		sc.close();
	}
	
	public static String kaikyu(double num){
		if(num <= 48.00){
			return "light fly";
		}else if(48.00 < num && num <= 51.00){
			return "fly";
		}else if(51.00 < num && num <= 54.00){
			return "bantam";
		}else if(54.00 < num && num <= 57.00){
			return "feather";
		}else if(57.00 < num && num <= 60.00){
			return "light";
		}else if(60.00 < num && num <= 64.00){
			return "light welter";
		}else if(64.00 < num && num <= 69.00){
			return "welter";
		}else if(69.00 < num && num <= 75.00){
			return "light middle";
		}else if(75.00 < num && num <= 81.00){
			return "middle";
		}else if(81.00 < num && num <= 91.00){
			return "light heavy";
		}else if(91.00 < num){
			return "heavy";
		}
		return null;
	}
}