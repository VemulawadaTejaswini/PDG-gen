import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String A = sc.next();
      	String B = sc.next();
      	String C = sc.next();
      
      	if(A.equals(B)){
			System.out.println(C);        	
        }else if(B.equals(C)){
          	System.out.println(A);
        }else{
        	System.out.println(B);
        }
    }
}