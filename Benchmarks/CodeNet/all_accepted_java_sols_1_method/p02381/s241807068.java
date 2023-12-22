import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
	    double avg = 0;
		  
		while((n = Integer.parseInt(input.readLine())) != 0){
		  String line = input.readLine();
		  String[] str = line.split(" ");
		  double[] data = new double[n];
		  
		  double sum = 0 , scat = 0 , dev = 0;
		  for(int i = 0 ; i < n ; i ++){
			  data[i] = Double.parseDouble(str[i]);
			  sum += data[i];
			  avg = sum / (double)n ;
		  }
		  for(int j = 0 ; j < n ; j++){
			  scat += Math.pow(avg - data[j], 2); 
		  }
		  
		  dev = Math.sqrt(scat/(double)n);
		  sb.append(dev + "\n");
		  
		}
		System.out.print(sb);
		
	}

}