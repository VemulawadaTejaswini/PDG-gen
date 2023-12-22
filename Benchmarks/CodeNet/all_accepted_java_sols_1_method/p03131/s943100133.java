import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong()+1;
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = Math.max((k-a)/2 , 0);
        System.out.println(b-2 > a ? a + (b-a)*c + (k-a)%2 : k);
    }
}
