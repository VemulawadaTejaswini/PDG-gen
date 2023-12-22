import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String test = br.readLine();
		
		String[] res1 = test.split(" ");
		
		String c = null;
		
		if(Integer.parseInt(res1[0]) > Integer.parseInt(res1[1])){
			c = res1[0];
			res1[0] = res1[1];
			res1[1] = c;
		}
		
		if(Integer.parseInt(res1[1]) > Integer.parseInt(res1[2])){
			c = res1[1];
			res1[1] = res1[2];
			res1[2] = c;	
		}
		
		if(Integer.parseInt(res1[0]) > Integer.parseInt(res1[1])){
			c = res1[0];
			res1[0] = res1[1];
			res1[1] = c;
		}
		System.out.println(res1[0] + " " + res1[1] + " " + res1[2]);
	}
}