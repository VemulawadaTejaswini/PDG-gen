import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      	Scanner sc = new Scanner(System.in);
      	String str = sc.next();
        if( Character.isUpperCase( str.charAt(0) ) ) {
    		System.out.println("A");
		} else {
    		System.out.println("a");
		}
    }
}