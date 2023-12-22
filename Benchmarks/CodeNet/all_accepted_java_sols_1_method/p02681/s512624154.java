import java.util.*;
import static java.lang.System.*;

public class Main {
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      String T = sc.nextLine();
      
      if(S.equals(T.substring(0,S.length()))){
        out.println("Yes");
      }
      else{
        out.println("No");
      }
    }
}