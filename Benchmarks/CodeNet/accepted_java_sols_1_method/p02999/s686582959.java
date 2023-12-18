import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();

        int result = 10;
        if (x < a) result = 0;
        
        System.out.println(result);
    }
}
