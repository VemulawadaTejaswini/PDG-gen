import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double ans = 1;

        for (int i = 1; i < x; i++) {
        	loop1:
        	for (int j = 2; j < x; j++) {
        		if (Math.pow(i, j) > x) {
        			break loop1;
        		}
        		if (ans < Math.pow(i, j)) {
        			ans = Math.pow(i, j);
        		}
        	}
        }
        System.out.println((int)ans);

        sc.close();
    }    
}
