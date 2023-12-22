import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String weather = sc.nextLine();
    
    if(weather.equals("Sunny"))
      System.out.println("Cloudy");
    if(weather.equals("Cloudy"))
      System.out.println("Rainy");
    if(weather.equals("Rainy"))
      System.out.println("Sunny");
  }
}