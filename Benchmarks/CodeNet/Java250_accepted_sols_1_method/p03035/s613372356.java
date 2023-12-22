import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        if (a >= 13) {
            result = b;
        } else if (6 <= a && a <= 12) {
            result = b / 2;
        }
        
        System.out.println(result);
    }
}
