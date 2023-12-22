import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int tmpsum = 0;
        for (int i = 0; i < n; i++) {
            tmpsum += sc.nextInt();
        }
        
        
        if (tmpsum >= sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
