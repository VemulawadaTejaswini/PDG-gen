import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    if(T.startsWith(S)) {
    	String is_one = T.substring(S.length());
    	if(is_one.length() == 1) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }else {
    	System.out.println("No");
    }
    
  }
}