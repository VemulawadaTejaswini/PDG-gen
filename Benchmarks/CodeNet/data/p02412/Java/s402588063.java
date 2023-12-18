import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    if (n == 0 && x == 0) {
		        break;
		    }
		    int count = 0;
		    for (int i = 1; i <= n; i++) {
		        for (int t = i + 1; t <= n; t++) {
		            for (int k = t + 1; k <= n; k++) {
		                if (i + t + k == x)
		                count++;
		            }
		        }
		    }
		    
		    
		    System.out.println(count);
		}
		
    }
}
