import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	if(num < 1200) {
          System.out.println("ABC");
        } else if(num < 2800) {
          System.out.println("ARC");
        } else {
          System.out.println("AGC");
        }
  }
}