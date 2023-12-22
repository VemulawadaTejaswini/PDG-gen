import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        String str = a + b;
        int num = Integer.parseInt(str);
        int result = (int)Math.sqrt(num);
        String ans;
        ans = (result*result) == num ? "Yes" : "No"; 
        System.out.println(ans);

    }
}
