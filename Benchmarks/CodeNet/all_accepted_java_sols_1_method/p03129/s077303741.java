import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	String input = sc.nextLine();
      	String inputs[] = input.split(" ");
      	int N = Integer.valueOf(inputs[0]);
      	int K = Integer.valueOf(inputs[1]);
      	int possible = (N+1)/2;
      	if(possible>=K) {
        	System.out.println("YES");
        }
      	else {
        	System.out.println("NO");
        }
    }
}