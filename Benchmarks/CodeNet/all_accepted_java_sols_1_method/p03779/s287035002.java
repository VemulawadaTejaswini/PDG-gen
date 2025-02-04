
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        X = Math.abs(X);

        int result=-1000;
        for (int i =0; i < X; i++) {
            int lower = i*(i+1)/2;
            int upper = (i+1)*(i+2)/2;
            if (lower<X && X<=upper) {
                result = i+1;
                break;
            }
        }

        System.out.println(result);
    }
}
