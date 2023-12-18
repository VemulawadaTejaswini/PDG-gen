import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			double input = Double.parseDouble(str);
			
			Sequence sq = new Sequence(input);
			
			System.out.println(sq.sum(10));
		}
	}

}

class Sequence {
	private double[] seq = new double[11];
	
	public Sequence(double a){
		seq[1] = a;
		
		for(int i = 2; i <= 10; i++){
			if(i % 2 == 0){
				seq[i] = seq[i-1]*2;
			}
			else {
				seq[i] = seq[i-1]/3;
			}
		}
	}
	
	public double sum(int n){
		double sum = 0;
		for(int i = 1 ; i <= n && i < seq.length ; i++){
			sum += seq[i];
		}
		
		return sum;
	}
}