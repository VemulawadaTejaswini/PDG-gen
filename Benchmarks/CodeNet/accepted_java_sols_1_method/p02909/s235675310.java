import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String ans = "";
    switch(str) {
      case "Sunny":
        ans = "Cloudy";
        break;
      case "Cloudy":
        ans = "Rainy";
        break;
      case "Rainy":
        ans = "Sunny";
        break;
    }
    System.out.println(ans);
  }
}
