import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int t = sc.nextInt();

        int result = 0;
        if (x - t > 0) result = x - t;

        System.out.println(result);
    }
}
