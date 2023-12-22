import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int D = sc.nextInt();
      String eve = String.join("", Collections.nCopies(25-D, " Eve"));
      String ans = "Christmas" + eve;
      System.out.println(ans);
      
    }
}