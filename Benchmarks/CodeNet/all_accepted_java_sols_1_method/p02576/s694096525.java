
import java.util.*;
public class Main {
 	public static void main(String[] args) {
     	Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	int x = s.nextInt();
      	int t = s.nextInt();
      
      	int count = n/x;
      	if(n%x != 0) 
          count += 1;
      	System.out.println(count*t);
    }
}