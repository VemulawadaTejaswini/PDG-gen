import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int min = s.nextInt();
    s.nextInt();
    s.nextInt();
    s.nextInt();
    int max = s.nextInt();
    int k = s.nextInt();
    System.out.println(max - min <= k ? "Yay!" : ":(");
  }
}
