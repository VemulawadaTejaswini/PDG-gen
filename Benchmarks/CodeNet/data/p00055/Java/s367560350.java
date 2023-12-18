import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static final double MIN = 1.0;
	static final double MAX = 10.0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			double a = Double.valueOf(br.readLine());
			if(a < MIN || MAX < a)	break;
			System.out.println(getSum(a));
		}
	}
	public static double getSum(double a){
		double sum = 0.0;
		sum = a * 633.0 / 81.0;
		return sum;
	}
}