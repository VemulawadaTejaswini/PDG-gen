import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int n = 0; n < 3000; n++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if (x == 0 && y == 0) {
                return;
            }
            else {
                if(x > y) {
                    int m;
                    m = x;
                    x = y;
                    y = m;
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
