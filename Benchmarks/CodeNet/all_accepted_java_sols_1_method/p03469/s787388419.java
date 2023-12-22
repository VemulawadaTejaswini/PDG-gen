import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc  = new Scanner(System.in);
      	String s = sc.next();
      	String s2 = "2018" + s.substring(4,s.length());
      
      	System.out.println(s2);
    }
}