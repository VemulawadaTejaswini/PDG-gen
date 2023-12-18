import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        
        System.out.println(x.substring(0,1).equals(y.substring(2,3)) && x.substring(1,2).equals(y.substring(1,2)) && x.substring(2,3).equals(y.substring(0,1))?"YES":"NO" );
    }
}
