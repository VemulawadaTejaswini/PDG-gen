import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
      	int a = s.nextInt();
      	int b = s.nextInt();
      	int ans = 0;
     	
      	for (int n = 0; n <= a + b; n++) {
        	if (a + (a - 1) * (n - 1) >= b) {
            	ans = n;
              	break;
            }
        }
      
      System.out.println(ans);
    }
}
