import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double time_of_500m, time_of_1000m;
	public static void main(String[] args) {
		while(sc.hasNextLine()){
			read();
			slove();
		}
	}
	static boolean read(){
		time_of_500m = sc.nextDouble();
		time_of_1000m = sc.nextDouble();
		return true;
	}
	static void slove(){
		//System.out.println(time_of_500m);
		//System.out.println(time_of_1000m);
		if(time_of_500m < 35.5 && time_of_1000m < 71.0){
			System.out.println("AAA");
		}else if(time_of_500m < 37.5 && time_of_1000m < 77.0){
			System.out.println("AA");
		}else if(time_of_500m < 40.0 && time_of_1000m < 83.0){
			System.out.println("A");
		}else if(time_of_500m < 43.0 && time_of_1000m < 89.0){
			System.out.println("B");
		}else if(time_of_500m < 50.0 && time_of_1000m < 105.0){
			System.out.println("C");
		}else if(time_of_500m < 55.0 && time_of_1000m < 116.0){
			System.out.println("D");
		}else if(time_of_500m < 70.0 && time_of_1000m < 148.0){
			System.out.println("E");
		}else{
			System.out.println("NA");
		}
	}
}