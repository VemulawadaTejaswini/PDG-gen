import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<Double>();
		
		while(true){
			String num1 = br.readLine();
			String num2 = br.readLine();
 			double x = Double.parseDouble(num1);
			double y = Double.parseDouble(num2);
			if(x == 0 && y == 0) break;
			list.add(x);
			list.add(y);
		}
		for (int i = 0 ; i < list.size() ; i++ ){
			double a = list.get(i);
			double b = list.get(i+1);
			System.out.printf("%.8f\n",a*Math.sqrt(4*b*b+a*a)+a*a);
			i++;
		}
	}
}