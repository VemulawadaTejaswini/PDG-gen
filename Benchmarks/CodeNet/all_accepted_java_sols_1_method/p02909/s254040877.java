import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      String weather =sc.next();
      String S ="Sunny";
      String C ="Cloudy";
      String R ="Rainy";
      
      if(weather.equals(S)){
      System.out.println(C);
      }
      else if(weather.equals(C)){
      System.out.println(R);
      }
      else{
      System.out.println(S);
      }
    }
}