import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String T = s.next();
		
		T = T.replaceAll("\\?", "D");
		
		System.out.println(T);
    }
}