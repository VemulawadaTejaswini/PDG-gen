import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n + 1];
        h[0] = Integer.MIN_VALUE;
        
        for (int i = 1; i <= n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            String parent = (i/2 > 0)      ? ", parent key = " + h[i/2]     : "";
            String right  = (2*i + 1 <= n) ? ", right key = "  + h[2*i + 1] : ""; 
            String left   = (2*i <= n)     ? ", left key = "   + h[2*i]     : ""; 
            
            System.out.println("node " + i + ": key = " + h[i] + parent + left + right + ",");
        }
    }
}
