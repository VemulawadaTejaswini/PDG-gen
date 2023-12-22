import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) {
 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
  
        String inputStr = null;
        String inputBallNum = null;
        String inputSelectStr = null;
      
        try {
            inputStr = br.readLine();
            inputBallNum = br.readLine();
            inputSelectStr = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
 		String[] str = inputStr.split(" ");
 		String[] ball = inputBallNum.split(" ");
      	
		int a = Integer.parseInt(ball[0]);
		int b = Integer.parseInt(ball[1]);
      
      	if(str[0].equals(inputSelectStr)){
          a--; 
        }else if(str[1].equals(inputSelectStr)){
          b--;
        }
      System.out.println(a + " " + b);
      
    }
 
}
