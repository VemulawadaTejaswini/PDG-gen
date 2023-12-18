
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int d;
			int result = 0;
		while(true){
			d = 0;
			result = 0;
			d = sc.nextInt();
			
			for(int i=0; i*d<600; i++){
				result = result + function(d*i)*d;
			}
			
			System.out.println(result);
		}
	}
	
	static int function(int d){
		return d*d;
	}
}