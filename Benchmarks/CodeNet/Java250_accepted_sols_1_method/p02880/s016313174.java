import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        boolean divisible = false;

        for(int i = 1; i < 10; i++) {
            double divided = (double)N/i;
            int count = 0;
            if(divided%1 == 0 && divided >= 1 && divided <= 9) {
                divisible = true;
            }
        }

        if(divisible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
}

    }
}