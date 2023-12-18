import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader stdReader =
        new BufferedReader(new InputStreamReader(System.in));
      String line0;
      line0 = stdReader.readLine();
      String hour=line0/3600;
      String minute=(line0%3600)/60;
      String sec=(line%3600)%60;
      stdReader.close();
      System.out.println(hour+":"+minute+":"+sec);
    } catch (Exception e) {
      e.getStackTrace();
      /*?????´??????0??????*/
      System.exit(0); 
    }
  }
}