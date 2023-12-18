import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        String result = "D";
        if (a.equals(b)) result = "H";
        
        System.out.println(result);
      
    }
}
