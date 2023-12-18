import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        if ((a + b) >= (a - b) && (a + b) >= (a * b)) {
            ans = a + b;
        } else if ((a - b) >= (a + b) && (a - b) >= (a * b)) {
            ans = a - b;
        } else {
            ans = a * b;
        }


        System.out.println(ans);

        sc.close();
    }    
}
