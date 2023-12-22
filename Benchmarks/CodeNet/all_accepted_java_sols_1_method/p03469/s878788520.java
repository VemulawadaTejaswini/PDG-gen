import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
		String b = a.substring(0, 3) + "8" + a.substring(4);
		System.out.println(b);
  }
}
