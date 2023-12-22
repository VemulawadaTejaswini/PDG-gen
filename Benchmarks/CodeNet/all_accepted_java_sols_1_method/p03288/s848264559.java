import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    String res = "";
    
    if (r < 1200) {
      res = "ABC";
    } else if (r < 2800) {
      res = "ARC";
    } else {
      res = "AGC";
    }
    
    System.out.println(res);
  }
}