import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        int n = sc.nextInt();
        String ans = "";
        for(int i = 0; i * n < s.length(); i++){
        	System.out.print(s.charAt(i * n));
        }
    }
}