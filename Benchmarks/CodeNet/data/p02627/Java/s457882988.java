import java.util.*;

public class Main {
 
	public static void main(String[] args) {
      Scanner sr = new Scanner(System.in);
      String str = sr.next();
      if(Character.isUpperCase(str.charAt(0)))
        System.out.println( "大文字です" );
      else 
        System.out.println( "小文字です" );
	}
}