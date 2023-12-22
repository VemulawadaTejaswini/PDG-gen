import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += l+i;
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<n;i++) {
            min = Math.min(min, Math.abs(i+l));
        }
      	if (sum > 0) {
        	System.out.println(sum - min);
        } else {
        	System.out.println(sum + min);
        }
        
    }
}