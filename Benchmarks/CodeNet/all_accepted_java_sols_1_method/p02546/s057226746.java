import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
      	String s = "s";
      if (a.substring(a.length() - 1).equals(s)) {
		System.out.println(a + "es"); 
      } else {
       System.out.println(a + "s");
      }
	}
}