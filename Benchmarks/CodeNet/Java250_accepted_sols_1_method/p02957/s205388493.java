import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        long z = n+y;
        System.out.println((n+y)%2==0?(n+y)/2:"IMPOSSIBLE");
        
}
}