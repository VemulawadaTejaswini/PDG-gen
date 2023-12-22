import java.util.*;
import static java.lang.System.*;

public class Main {
 	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	boolean isJust = false;
		for(int i = 0; i <= 25; i++) {
        	for(int j = 0; j <= 14; j++) {
            	int total = i * 4 + j * 7;
              	if(total == N) isJust = true;
            }
        }
      	if(isJust)   out.println("Yes");
      	if(! isJust) out.println("No");
    }
}