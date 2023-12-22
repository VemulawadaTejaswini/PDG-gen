import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = 1;
        if (a+b == 3) {
           result = 3;
        } else if (a+b == 4) {
           result = 2;
        }
        
        System.out.println(result);
    }
}
