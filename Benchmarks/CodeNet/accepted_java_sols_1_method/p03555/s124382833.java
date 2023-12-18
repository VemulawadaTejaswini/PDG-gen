import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String c1j = sc.next();
      	String c2j = sc.next();
	   	
      	if((c1j.charAt(0)==c2j.charAt(2))
          && (c1j.charAt(1)==c2j.charAt(1))
          && (c1j.charAt(2)==c2j.charAt(0))){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
    }
}