import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int a = Integer.parseInt(tmpArray[0]);
		int b = Integer.parseInt(tmpArray[1]);
		int c = Integer.parseInt(tmpArray[2]);
		int x = Integer.parseInt(tmpArray[3]);
		int y = Integer.parseInt(tmpArray[4]);
		
		int AB = (a + b)/2;
		
		long result = 0;
		if(AB >= c){
			int tmp = Math.min(x, y);
			
			x -= tmp;
			y -= tmp;
			
			result += tmp*2*c;
			
//			System.out.println(result);
		}
		
		if(a > 2*c){
			a = 2*c;
		}
		
		if(b > 2*c){
			b = 2*c;
		}
		
		result += x*a;
		result += y*b;
		
		System.out.println(result);
	}

}
