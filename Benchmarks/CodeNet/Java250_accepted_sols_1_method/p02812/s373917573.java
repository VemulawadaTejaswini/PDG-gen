import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	
      	int n = sc.nextInt();
      	String s = sc.next();
      	String ref = "ABC";
      	int sum = 0;
      
      	for (int i = 0; i + 2 < n; i++){
        	if (ref.equals(s.substring(i, i+3)))
            	sum++;
        }
      	
      	System.out.println(sum);
    }
}
