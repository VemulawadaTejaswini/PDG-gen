import java.util.*;

public class Main{
	public static void main(String[] args) {
    	Scanner itr = new Scanner(System.in);
      	String s = itr.next();
      	
      	int a = 0;
      	int b = 0;
      	for (char i : s.toCharArray()) {
        	if (i == 'A') a++;
          	else b++;
        }
      
      	if (a == 0 || b == 0)
          System.out.println("No");
      	else
          System.out.println("Yes");
    }
}
