import java.util.*;
public class Main {
	public static void main(String[] args){
 
      Scanner sc = null;
      sc = new Scanner(System.in);
      String S = sc.nextLine();
      if(Character.isUpperCase(S.charAt(0))){
        System.out.println( "A" );
      }
      else {
        System.out.println( "a" );
      }
    }
}