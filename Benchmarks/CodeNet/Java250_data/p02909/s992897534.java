import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    String weather=scanner.next();
    if(weather.equals("Sunny")){
      System.out.println("Cloudy");
    } if(weather.equals("Cloudy")){
      System.out.println("Rainy");
    } if(weather.equals("Rainy")){
      System.out.println("Sunny");
    }
  }
}