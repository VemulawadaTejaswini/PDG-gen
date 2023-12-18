import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    if(line.equals("Sunny")) {
      System.out.println("Cloudy");
    } else if(line.equals("Cloudy")) {
      System.out.println("Rainy");
    } else if(line.equals("Rainy")) {
      System.out.println("Sunny");
    }
  }
}