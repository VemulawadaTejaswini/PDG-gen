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

    double angle = 0; 
    if(h*30>m*6){
      if(h-m>180){
        angle = (h*30)-(m*6)-180;
      } else {
        angle = (h*30)-(m*6);
      }
    } else{
      if(m-h>180) {
        angle = (m*6)-(h*30)-180;
      } else {
        angle = (m*6)-(h*30);
      }
    }
    System.out.println(angle);
    
    double angle_db = Double.parseDouble(String.format("%f",(Math.cos(Math.toRadians(angle)))));
    double sqrt = Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(angle));
    System.out.println(Math.sqrt(sqrt));
  }
}
      