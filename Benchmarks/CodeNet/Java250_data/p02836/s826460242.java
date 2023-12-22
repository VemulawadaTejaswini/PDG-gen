import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        if(s.length() % 2 == 0){
        	String s1 = s.substring(0, s.length() / 2);
            String s0 = s.substring(s.length() / 2);
            StringBuffer str = new StringBuffer(s0);
            String s2 = str.reverse().toString();
            for(int i = 0; i < s1.length(); i++){
            	if(s1.charAt(i) != s2.charAt(i)){
                	count++;
                }
            }
        }else{
        	String s1 = s.substring(0, s.length() / 2);
            String s0 = s.substring((s.length() / 2) + 1);
            StringBuffer str = new StringBuffer(s0);
            String s2 = str.reverse().toString();
            for(int i = 0; i < s1.length(); i++){
            	if(s1.charAt(i) != s2.charAt(i)){
                	count++;
                }
            }
        }
        System.out.println(count);
    }
}