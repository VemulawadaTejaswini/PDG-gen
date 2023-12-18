import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long c = sc.nextLong();
        long ans = Math.min(s,c/2);
        c -= ans*2;
        System.out.print(ans + c/4);
    }
}