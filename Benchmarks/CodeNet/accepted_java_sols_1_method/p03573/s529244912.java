import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = a;
        if (a == b) {
            result = c;
        } else if (a == c) {
            result = b;
        }

        System.out.println(result);
    }
}
