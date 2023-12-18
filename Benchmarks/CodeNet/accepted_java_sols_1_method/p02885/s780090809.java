import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt() * 2;

        if (a >= b) {
            System.out.println((a-b));
        } else {
            System.out.println(0);
        }
        sc.close();
    }    
}
