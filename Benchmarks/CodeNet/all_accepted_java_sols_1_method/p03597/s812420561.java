import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        
        int ans = num_1 * num_1 - num_2;
        System.out.println(ans);
    }
}