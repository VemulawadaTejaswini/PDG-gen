import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		String n = sc.next();
      	char[] ary = new char[n.length()];
      	
      	for(int i = 0; i < n.length(); i++) {
         	ary[i] = n.charAt(i); 
          	
          	if(ary[i] == '1') {
	            ary[i] = '9';
            } else if(ary[i] == '9') {
            	ary[i] = '1';
            }
        	System.out.print(ary[i]);
        }
    }
}