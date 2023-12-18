import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int h = Integer.parseInt(str[2]);
    int m = Integer.parseInt(str[3]);
    double hour = (h*30)+(m*0.5);
    double min = m*6;
    
    double angle = 0; 
    if(hour>min){
      if(hour-min>=180){
        angle = hour-min-180;
      } else {
        angle = hour-min;
      }
    } else{
      if(min-hour>=180) {
        angle = min-hour-180;
      } else {
        angle = min-hour;
      }
    }
    
    double angle_db = Double.parseDouble(String.format("%f",(Math.cos(Math.toRadians(angle)))));
    double sqrt = Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(angle));
    System.out.println(Math.sqrt(sqrt));
  }
}
     