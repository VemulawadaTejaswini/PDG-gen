import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b;
            b = 100000;
            for (int i=0; i<a; i++){
                b *= 105;
                b /= 100;
                if (b%1000 != 0){
                    b -= b%1000;
                    b += 1000;
                }
            }
            System.out.println(b);
        }
    }
}
