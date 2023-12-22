import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      int right = str.length()-1;
      int left = 0;
      
      int ret = 0;
      
      while(left<right){
        char leftchr = str.charAt(left);
        char rightchr = str.charAt(right);
        if(leftchr != rightchr) ret++;
        left++;
        right--;
        
      }
      
      System.out.println(ret);
      
    }
}