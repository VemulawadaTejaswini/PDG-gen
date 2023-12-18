import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();


        if (s < 3) {
            System.out.println(0);
        }

        if (s == 3) {
            System.out.println(1);
        }

        Queue<Integer> queue = new LinkedList<>();

        BigInteger count = BigInteger.ZERO;

        int n = 3;
        while (s - n >= 0) {
            if (s - n == 0) {
                count = count.add(BigInteger.ONE);
            } else if (s - n >= 3) {
                queue.add(s - n);
            }
            n++;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            System.out.println("size :" + size);
            for (int i = 0; i < size; i++) {

                int value = queue.poll();

                n = 3;
                while (value - n >= 0) {
                    if (value - n == 0) {
                        count = count.add(BigInteger.ONE);
                    } else if (value - n >= 3) {
                        queue.add(value - n);
                    }
                    n++;
                }

            }
        }

        System.out.println((count.remainder(BigInteger.valueOf(1000000007))));
    }
}