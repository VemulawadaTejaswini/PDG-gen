import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      	String strS = sc.next();
      	
      	String strT = sc.next();
      
     	strT = strT.substring(0, strT.length() - 1);
       	
      	if (strS.equals(strT)) {
        System.out.println("Yes");
        } else {
        System.out.println("No");
        }
  	
	}
}