import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int S = sc.nextInt();
        
        if (S == N) {
            System.out.println("Yes");
        } else if (S < N) {
            System.out.println("No");
        }
        
    }
}