import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        String result = "Balanced";
        if (a+b > c+d) {
            result = "Left";
        } else if (a+b < c+d) {
            result = "Right";
        }
        
        System.out.println(result);
    }
}
