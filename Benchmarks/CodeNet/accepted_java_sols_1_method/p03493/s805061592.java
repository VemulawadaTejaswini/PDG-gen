import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	String[] ary = s.split("", 0);
      	int count = 0;
      
      	for(int i = 0; i < ary.length; i++) {
        	if(ary[i].equals("1")) count++;  
        }
      	System.out.println(count);
    }
}