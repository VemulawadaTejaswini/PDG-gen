import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int t=0;
        a=sc.nextInt();
        b=sc.nextInt();
        t=sc.nextInt();
        
        System.out.println(((int)(t+0.5)/a)*b);
    }
}
