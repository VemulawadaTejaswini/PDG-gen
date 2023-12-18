import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class main {
  public static void main(String[] agrs){
	  System.out.println("求めたいの円の半径を入力してください：(cm)");
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    try {
	    	String r = reader.readLine();
	    	double R = Integer.parseInt(r);
	    	double S =(Math.PI) * R * R;
	    	double D =(Math.PI) * R * 2;
	    	System.out.printf("%f\n",S);
	    	System.out.printf("%f\n",D);
	    	
	    }catch(IOException e) {
	    	 System.out.println(e);
	     }catch(NumberFormatException e) {
	    	 System.out.println("you input wrong number.");
	  
	  
  }
}
}

