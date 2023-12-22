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
      int a =Integer.parseInt(Array[0]);
      int b =Integer.parseInt(Array[1]);
      int c =Integer.parseInt(Array[2]);
      if(a<b&&b<c){
          System.out.println("Yes");
	  }else{
          System.out.println("No");
	  }
	  
	  
      stdReader.close();
    } catch (Exception e) {
      e.getStackTrace();
      /*?????´??????0??????*/
      System.exit(0); 
    }
  }
}