import java.util.*;

class Main{
 	public static void main(String... args){
    	String s = new Scanner(System.in).next();
    	System.out.println(s.matches("hi") || s.matches("hihi") || s.matches("hihihi") || s.matches("hihihihi") || s.matches("hihihihihi") ? "Yes" : "No");
    }
}