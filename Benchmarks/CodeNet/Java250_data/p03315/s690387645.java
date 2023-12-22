import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
	  int cnt = 0;
      for(char c : s.toCharArray())
        	if(c == '-') cnt++;
      System.out.println(s.length() - cnt - cnt);
  }
}