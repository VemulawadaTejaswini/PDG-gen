import java.util.*;
import java.lang.Character;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    for(int i=0;i<s.length();++i){
    	if(Character.isLowerCase(s.charAt(i))) ans+=Character.toUpperCase(s.charAt(i));
    	else ans+=Character.toLowerCase(s.charAt(i));
    }
    System.out.println(ans);
  }
}