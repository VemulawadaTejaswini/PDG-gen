import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        int x = A + (A-1);
        int y = B + (B-1);
        int z = A + B;
        
        System.out.println(Math.max(z, Math.max(x, y)));
    }
}
