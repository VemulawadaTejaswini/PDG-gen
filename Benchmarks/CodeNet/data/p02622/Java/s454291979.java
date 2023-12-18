import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
      	String s = sc.next();
      	int count = 0;
      	for(int cnt = 0;cnt < n.length();cnt++){
        	if(n.charAt(cnt) != s.charAt(cnt)){
            	count++;
            }
        }
      	System.out.println(count);
	}
}