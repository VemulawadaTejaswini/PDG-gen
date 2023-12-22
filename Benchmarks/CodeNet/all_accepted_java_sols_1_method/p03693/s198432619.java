import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = "";
        for (int i = 0; i < 3; i++) {
        	s += sc.next();
        }
        
        System.out.println(Integer.parseInt(s) % 4 == 0 ? "YES" : "NO");
    }
}