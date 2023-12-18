import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        String ans = "Yes";

        if (500 * K < X) {
            ans = "No";
        }

        System.out.println(ans);

        sc.close();
    }    
}
