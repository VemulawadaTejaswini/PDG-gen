import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	if (A + B < 2 * C) {
    		System.out.println(A * X + B * Y);
    	} else {
    		if (Y < X) {
    			if (A < 2 * C) {
    				System.out.println(C * 2 * Y + A * (X - Y));
    			} else {
    				System.out.println(C * X * 2);
    			}
    		} else {
    			if (B < 2 * C) {
    				System.out.println(C * 2 * X + B * (Y - X));
    			} else {
    				System.out.println(C * Y * 2);
    			}
    		}
    	}
    }
}