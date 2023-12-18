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
		  int[] data = new int[n];
		  int sum = 0;
		  double scat = 0 , dev = 0;
		  for(int i = 0 ; i < n ; i ++){
			  data[i] = Integer.parseInt(str[i]);
			  sum += data[i];
			  avg = sum / n ;
		  }
		  for(int j = 0 ; j < n ; j++){
			  scat += Math.pow(avg - data[j], 2); 
		  }
		  
		  dev = Math.sqrt(scat/n);
		  sb.append(dev + "\n");
		  
		}
		System.out.print(sb);
		
	}

}