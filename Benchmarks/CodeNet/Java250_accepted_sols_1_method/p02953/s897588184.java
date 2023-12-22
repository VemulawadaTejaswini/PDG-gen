import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N < 2) {
    	System.out.println("Yes");
    }
    else {
    	int a, b, count;
    	String output = "Yes";
    	a = sc.nextInt();
    	//b = sc.nextInt();
    	count = 0;
    	for(int i = 1; i < N; i++) {
    		b = sc.nextInt();
    		if(b - a <= -2) {
    			output = "No";
    			break;
    		}
    		if(b - a == -1) {
    			count++;
    			if(count == 2) {
        			output = "No";
        			break;
        		}
    		}else if(b - a > 0) {
    			count = 0;
    		}
    		a = b;
    	}
    	System.out.println(output);
    	sc.close();
    }
  }
}