import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	  public static void main(String[] args){
			    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			    try{
			    String value = br.readLine();
			    int inputValue = Integer.valueOf(value);
			    System.out.println(inputValue * inputValue * inputValue);
			    }catch(IOException e){

			    }
			  }


}