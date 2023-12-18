import java.util.*;
import java.io.*;

public class Main{
	public static int sum(double x, int n){
		int sum = 0;
		while( n-- > 0 ){
			x *= 10;
			sum += x%10;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				int n = stdIn.nextInt();
				double x = (double) a/b;
				result.add(sum(x, n));
			}
			
			for(Integer sum : result){
				System.out.println(sum);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}