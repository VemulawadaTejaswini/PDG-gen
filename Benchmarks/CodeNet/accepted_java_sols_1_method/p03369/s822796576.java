import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int i = (S.replace("x","").length()) * 100;
      System.out.println(700 + i);
	}
}  