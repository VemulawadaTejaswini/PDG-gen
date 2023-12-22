import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int num = Integer.parseInt(a+b);
        
        for(int x=1; x<=1000; x++) {
            if(x*x==num) {
                System.out.println("Yes");
                return ;
            }
        }
        System.out.println("No");
    }
}
