import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        int n1 = Integer.parseInt(s.substring(0,1));
        int n2 = Integer.parseInt(s.substring(1,2));
        int n3 = Integer.parseInt(s.substring(2,3));
        int n4 = Integer.parseInt(s.substring(3,4));
        if(n1 + n2 + n3 + n4 == 7){
        	System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "=7");
        }else if(n1 + n2 - n3 + n4 == 7){
        	System.out.println(n1 + "+" + n2 + "-" + n3 + "+" + n4 + "=7");
        }else if(n1 + n2 + n3 - n4 == 7){
        	System.out.println(n1 + "+" + n2 + "+" + n3 + "-" + n4 + "=7");
        }else if(n1 + n2 - n3 - n4 == 7){
        	System.out.println(n1 + "+" + n2 + "-" + n3 + "-" + n4 + "=7");
        }else if(n1 - n2 + n3 + n4 == 7){
        	System.out.println(n1 + "-" + n2 + "+" + n3 + "+" + n4 + "=7");
        }else if(n1 - n2 - n3 + n4 == 7){
        	System.out.println(n1 + "-" + n2 + "-" + n3 + "+" + n4 + "=7");
        }else if(n1 - n2 + n3 - n4 == 7){
        	System.out.println(n1 + "-" + n2 + "+" + n3 + "-" + n4 + "=7");
        }else if(n1 - n2 - n3 - n4 == 7){
        	System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "=7");
        }
    }
}