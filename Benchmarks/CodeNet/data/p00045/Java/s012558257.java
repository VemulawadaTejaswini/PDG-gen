import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	
	static BufferedReader reader =
			new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args)throws IOException{
		Main byakko = new Main();
		
		String str;
		int sum = 0,count = 0;
		double cost = 0;
		
		while((str = reader.readLine()) != null){
			String[] buy = str.split(",", 0);
			
			sum += byakko.sum(buy[0], buy[1]);
			
			cost += byakko.cost(buy[1]);
			
			count++;
		}
		System.out.println(sum);
		System.out.println(Math.round(cost / count));
		
		reader.close();
	}
	
	public int sum(String x, String y){
		int sum = 0;
		int z = Integer.parseInt(x);
		int v = Integer.parseInt(y);
		
		sum = z * v;
		
		return sum;
	}
	
	public double cost(String x){
		double z = Double.parseDouble(x);
		
		return z;
	}
}