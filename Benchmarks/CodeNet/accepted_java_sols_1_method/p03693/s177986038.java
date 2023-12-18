import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int num = 10*g+b;
        
        String result = "NO";
        if (num % 4 == 0) result = "YES";
        System.out.println(result);
    }
}
