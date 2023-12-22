import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
	in.close();
    String ans = "Good";
    if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2) || str.charAt(2) == str.charAt(3)) {
      ans = "Bad";
    }
    System.out.println(ans);
  }
}