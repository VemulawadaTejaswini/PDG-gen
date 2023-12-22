import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 		String input = null;
      
        try {
            input = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
		int len = input.length();
        String ret = "";
      
      	for (int i = 0; i < len; i++){
          ret = ret + "x";
        }
      
        System.out.println(ret);
    }
 
}
