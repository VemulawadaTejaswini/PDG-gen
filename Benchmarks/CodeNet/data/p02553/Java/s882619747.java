import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();
        Long d = sc.nextLong();
        
        Long max = Math.max(Math.max(a*c,a*d),Math.max(c*b,d*b));
        System.out.println(max);
    }
}