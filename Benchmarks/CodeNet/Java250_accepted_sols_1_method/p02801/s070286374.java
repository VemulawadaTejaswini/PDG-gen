import java.util.*;

public class Main {
  public static void main(String args[]) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Scanner sc = new Scanner(System.in);
    
    String C = sc.next();
    sc.close();
    
    for(int i = 0; i < alphabet.length()-1; i++) {
		if (alphabet.substring(i,i+1).equals(C)) {
          System.out.println(alphabet.substring(i+1,i+2));
		}
	}
  }
}
    