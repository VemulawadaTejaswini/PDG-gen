import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
		  int n = Integer.parseInt(input.readLine());
		  if(n == 0) break;
		  String line = input.readLine();
		  String[] str = line.split(" ");
		  double[] data = new double[n];
		  
		  double avg = 0 , sum = 0 , scat = 0 , dev = 0;
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