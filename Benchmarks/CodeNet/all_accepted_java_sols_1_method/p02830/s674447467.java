import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String x = sc.next();
        String y = sc.next();
        
        StringBuilder bld = new StringBuilder();
        for(int i = 0;i<n;i++){
            bld.append(x.charAt(i));
            bld.append(y.charAt(i));
        }
        
        System.out.println(bld.toString());
    }
}