import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double[] sequence;	
	static  int i;
	static double Sum = 0.0;
	public static void main(String[] args) {
		
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNextDouble())return false;
		
		sequence = new double[11];
		sequence[0] = 0.0;
		sequence[1] = 0.0;
		sequence[1] = sc.nextDouble();
		return true;
	}
	static void slove(){
		
		for(i = 2; i <= 10; i++){
			if(i%2 == 0){
				sequence[i] = 2*sequence[i-1];
			}else{
				sequence[i] = sequence[i-1]/3;
			}
			//System.out.println(sequence[i]);
		}
		for(i = 1; i <= 10; i++){
			Sum = Sum + sequence[i];
		}
		for(i = 1; i <= 10; i++){
			sequence[i] = 0.0;
		}
		System.out.println(Sum);
		Sum = 0.0;
	}
}