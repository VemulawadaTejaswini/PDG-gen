import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        for(int i = 0; i < s1.length(); i++){
        	if(s1.equals(s2)){
            	System.out.println("Yes");
            	return;
            }
            s1 = s1.charAt(s1.length() - 1) + s1.substring(0, s1.length() - 1);
        }
        System.out.println("No");
    }
}