import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long sum = 1;

        for (int i= 0; i< n; i++) {

            long x = scan.nextLong();
            sum *= x;
        }

        if ((double)sum > Math.pow(10.0, 18.0) ) {
            System.out.println(-1);

        }
        else {
            System.out.println(sum);
        }


    }


}