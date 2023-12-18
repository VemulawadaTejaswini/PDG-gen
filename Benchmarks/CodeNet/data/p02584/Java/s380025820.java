
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong()), k = sc.nextLong(), d = sc.nextLong();
        if(x - k * d >= 0){
            System.out.println(x - k * d);
        }else {
            long remainX = x - (x / d) * d, remainK = k - x / d;
            boolean isEven = remainK % 2 == 0;
            if (isEven) {
                System.out.println(Math.min(Math.abs(remainX), Math.abs(remainX - d * 2)));
            } else {
                System.out.println(Math.min(Math.abs(remainX + d), Math.abs(remainX - d)));
            }
        }
    }
}
