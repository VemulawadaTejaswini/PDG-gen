import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int t = 0;
        int x = 0;
        int y = 0;
        while (n-- > 0) {
            int nt = sc.nextInt();
            int nx = sc.nextInt();
            int ny = sc.nextInt();
            
            int dist = Math.abs(nx-x) + Math.abs(ny-y);
            
            if (nt % 2 != (nx+ny) % 2) {
                System.out.println("No");
                return;
            }
            
            if (nt - t < dist) {
                System.out.println("No");
                return;
            }
            
            t = nt;
            x = nx;
            y = ny;
        }
        
        
        System.out.println("Yes");
    }
}