import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) {
	try {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String input;
			input = buf.readLine();
			
			String[] strAry = input.split(" ");
		       int x = Integer.parseInt(strAry[0]);
		       int y = Integer.parseInt(strAry[1]);
		       int z = Integer.parseInt(strAry[2]);
		       
		     if(x <  y && y  < z){
		    	 System.out.println("Yes");
		     }
		     else{
				System.out.println("No");
			}
	} catch (Exception e) {
		// TODO: handle exception
	}
}

}