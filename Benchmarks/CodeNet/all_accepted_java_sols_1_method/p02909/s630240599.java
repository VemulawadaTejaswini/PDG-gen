import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();

    String ans;

    if (s.equals("Sunny")) {
      ans = "Cloudy";
    } else
    if (s.equals("Cloudy")) {
      ans = "Rainy";
    } else {
      ans = "Sunny";
    }

    System.out.println(ans);

    sc.close(); 
  }
}
