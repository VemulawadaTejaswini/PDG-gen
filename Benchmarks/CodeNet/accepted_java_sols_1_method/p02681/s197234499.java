import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      		String S = sc.next();
            String T = sc.next();
      
      		if(S.substring(0,S.length()).equals(T.substring(0,S.length()))){
            	System.out.println("Yes");}
      		else{
            	System.out.println("No");}
    }
}
