import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        double p = 0;
        int a, c;
        for (int i = 1; i <= n; i++) {
        	a = i;
        	c = 0;
        	while (a < k) {
        		c++;
        		a *= 2;
        	}
        	p += Math.pow(0.5, c) / n;
        }
        System.out.println(p);
    }
    
}