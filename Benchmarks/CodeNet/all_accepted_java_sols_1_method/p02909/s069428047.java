//Weather Prediction
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String m=sc.next();
    String s="Sunny";
    String c="Cloudy";
    String r="Rainy";

    if(m.equals(s)) System.out.println("Cloudy");
    if(m.equals(c)) System.out.println("Rainy");
    if(m.equals(r)) System.out.println("Sunny");
  }
}
