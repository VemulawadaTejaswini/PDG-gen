import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), a, v, max = Integer.MIN_VALUE, maxNum = 0;
        for(int i = 0; i < n; i++) {
        	a = sc.nextInt();
        	v = sc.nextInt();
        	
        	if(v > max) {
        		max = v;
        		maxNum = a;
        	}
        }
        
        System.out.println(maxNum + " " + max);
    }
}