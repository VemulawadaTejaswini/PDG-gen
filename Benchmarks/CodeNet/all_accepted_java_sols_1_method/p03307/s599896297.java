import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       if( !(n%2 == 0)) n *= 2;
       System.out.println(n);
    }
}