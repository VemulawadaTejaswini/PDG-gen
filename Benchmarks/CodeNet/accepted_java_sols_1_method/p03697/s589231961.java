import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "error";
        if (a+b < 10) result = String.valueOf(a+b);
        
        System.out.println(result);
    }
}
