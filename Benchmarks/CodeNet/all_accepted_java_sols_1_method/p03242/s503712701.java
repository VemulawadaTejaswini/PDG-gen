import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		String n = sc.next();
      	String[] ary = n.split("");
      
      	for(int i = 0; i < ary.length; i++) {
        	if(ary[i].equals("1")) {
            	ary[i] = "9";
            } else if(ary[i].equals("9")) {
              	ary[i] = "1";
            }
  			System.out.print(ary[i]);
        }
    }
}