import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
  	int len = str.length();
  	char[] c = new char[len];
	char c1 = str.charAt(0);
  	char c2 = str.charAt(1);
  	char c3 = str.charAt(2);
  	
  	if((c1=='A')&&(c2=='A')&&(c3=='A')){
      System.out.println("No");
    }else if((c1=='B')&&(c2=='B')&&(c3=='B')){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
	}
}