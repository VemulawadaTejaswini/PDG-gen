import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String S = sc.next();
      	String[] strArray = new String[S.length()];
      
      	for (int i = 0; i < S.length(); i++) {
    		String str2 = String.valueOf(S.charAt(i));
      		strArray[i] = str2;
          	if(i>0){
            	if(!(strArray[i].equals(strArray[i-1]))){
                	System.out.println("Yes");
                	return;
                }
            }
		}
      	System.out.println("No");
    }
}