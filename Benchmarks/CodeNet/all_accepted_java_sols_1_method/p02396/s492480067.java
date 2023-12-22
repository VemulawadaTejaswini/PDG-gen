import java.util.*;
public class Main {
    public static void main(String aegs[]) {
        Scanner s = new Scanner(System.in);
        for(int x = 1; x <= 10000; x++) {
            int a = s.nextInt();
            if (a == 0) {
                return ;
            }else {
                System.out.println("Case " + x + ": " + a);
            }
        }
    }
}
