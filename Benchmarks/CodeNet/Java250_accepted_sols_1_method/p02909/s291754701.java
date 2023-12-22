import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Sunny";
    if(s.equals("Sunny")) ans = "Cloudy";
    if(s.equals("Cloudy")) ans = "Rainy";
    System.out.println(ans);
  }
}