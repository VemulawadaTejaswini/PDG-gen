import java.util.*;

public class Main {
	public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        long product = 1L;
        long limit = (long) Math.pow(10, 18);

        for (int i = 1; i <= N; i++) {
            long A_i = scan.nextInt();

            product = product * A_i;
        }

        if (product > limit) {
            System.out.println("-1");
            return;
        }
        
        System.out.println(product);
    }

}