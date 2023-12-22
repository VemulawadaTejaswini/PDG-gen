import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
            //System.out.println(str);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      
      String[] inputStrArray = str.split(" ");
      int[] inputIntArray = new int[3];
      int amount = 0;
      for(int i=0; i<3; i++){
        inputIntArray[i] = Integer.parseInt(inputStrArray[i]);
        amount += inputIntArray[i];
      }
      
      if(amount <= 21){
        System.out.println("win");
      }
      else{
        System.out.println("bust"); 
      }
      
      
	}
}