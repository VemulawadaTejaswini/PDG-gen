import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Integer.parseInt(a + b);
        int y = (int)Math.sqrt(x);
        if(x == y * y)System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

}
