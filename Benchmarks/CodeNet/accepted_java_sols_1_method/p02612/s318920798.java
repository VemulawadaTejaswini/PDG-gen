import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        if(n % 1000 == 0) System.out.println(0);
        else System.out.println(1000 - n%1000);
    }
}
