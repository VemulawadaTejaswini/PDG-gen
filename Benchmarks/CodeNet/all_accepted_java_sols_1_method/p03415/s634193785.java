import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        
        System.out.println(one.substring(0,1)+two.substring(1,2)+three.substring(2,3));
    }
}
