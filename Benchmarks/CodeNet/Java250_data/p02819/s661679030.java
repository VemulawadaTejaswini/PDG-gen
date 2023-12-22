
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long X;
        try (Scanner sc = new Scanner(System.in)) {
            X = sc.nextLong();
        }
        long kouho = X;

        while(true) {
            boolean noDIv = true;
            for (int i = 2; i < kouho; i++) {
                if(kouho % i == 0) {
                    kouho++;
                    noDIv = false;
                    break;
                }            
            }
            if(noDIv) {
                //素数発見
                break;
            }
        }
        System.out.println(kouho);
    }
}
