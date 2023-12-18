import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int max = 0;
        int dummy = 0;

        for (int i = 1; i < n; i++) {
            if (h[i-1] >= h[i]) {
                dummy++;
            } else {
                max = Math.max(max, dummy);
                dummy = 0;
            }
        }

        max = Math.max(max, dummy);
        System.out.println(max);
	}
}
