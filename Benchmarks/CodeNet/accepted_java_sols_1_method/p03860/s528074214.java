import java.util.*;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      
      	String a = sc.next();
      	String s = sc.next();
     	String c = sc.next();
      
      	String x = a.substring(0,1) + s.substring(0,1) + c.substring(0,1);
      
      	System.out.println(x);
    }
}