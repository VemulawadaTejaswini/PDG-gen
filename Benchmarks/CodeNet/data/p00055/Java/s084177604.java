import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Double> result = new ArrayList<Double>();
		
		double mul = (double)211/27;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				double a = stdIn.nextDouble();
				result.add(a*mul);
			}
			
			for(Double ans : result){
				System.out.printf("%.8f%n", ans);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}