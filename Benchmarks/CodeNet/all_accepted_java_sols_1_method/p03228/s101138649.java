import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int k = sc.nextInt();

    	for (int i = 0; i < k; i++) {
    		if ((a % 2) != 0) {
    			a--;
    		}
    		a /= 2;
    		b += a;
    		i++;
    		
    		if (i < k) {
    			if ((b % 2) != 0) {
        			b--;
        		}
        		b /= 2;
        		a += b;
    		}
    	}
    	System.out.println(a + " " + b);
    	sc.close();
    }
}