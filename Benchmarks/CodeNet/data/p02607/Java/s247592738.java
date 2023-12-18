import java.util.*;

public class Main {

    public static void main(String args[])  {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] list = new int[n];
        int sum = 0;

        for (int i =0; i<n; i++) {
            int a = scan.nextInt();

            if (i % 2== 0 && a % 2== 1) {
                sum++;
            }
        }
        System.out.println(sum);

    }

}