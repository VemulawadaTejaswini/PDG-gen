import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) {
	try {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			String input;
			input = buf.readLine();
			
			String[] strAry = input.split(" ");
		       int W = Integer.parseInt(strAry[0]);
		       int H = Integer.parseInt(strAry[1]);
		       int x = Integer.parseInt(strAry[2]);
		       int y = Integer.parseInt(strAry[3]);
		       int r = Integer.parseInt(strAry[4]);
		       
		     if(0 > (x - r) || (x + r) > W){
		    	 	System.out.println("No");    	 	
		     }
		     else if(0 > (y - r) || (y +r) > H){
		    	 	System.out.println("No");
		     }
		     else{
		    	 System.out.println("Yes");
		     }
		     
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}