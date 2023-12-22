
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;


        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
        }

        long sqr = (long) Math.sqrt(A);
        long result = 0;
        for (long i = sqr; i >  0; i--) {
            if(A % i == 0){
                result = (i) + (A/i) -2;
                break;
            }
        }
        System.out.println(result);


    }


}
