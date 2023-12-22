import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader stdReader =
        new BufferedReader(new InputStreamReader(System.in));
      String line0;
      line0 = stdReader.readLine();

      String Array[]=line0.split(" ");
      if( Integer.parseInt(Array[0])>Integer.parseInt(Array[1])     ){
          System.out.println("a > b");
	  }
	  
	  if( Integer.parseInt(Array[0])< Integer.parseInt(Array[1])){
          System.out.println("a < b");
	  }
	  
	  if( Integer.parseInt(Array[0])== Integer.parseInt(Array[1])){
          System.out.println("a == b");
	  }
	  
	  
      stdReader.close();
    } catch (Exception e) {
      e.getStackTrace();
      /*?????´??????0??????*/
      System.exit(0); 
    }
  }
}