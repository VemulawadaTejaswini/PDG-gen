import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int sz = 0;
        int y = b;
        while(y > 0 ){
            y /= 10;
            sz ++;
        }
        a = b + a *(int)Math.pow(10,sz);
        if((int)Math.sqrt(a) * (int)Math.sqrt(a) == a) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
