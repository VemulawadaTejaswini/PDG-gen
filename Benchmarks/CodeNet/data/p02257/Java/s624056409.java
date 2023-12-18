import java.util.Scanner;

/**
 * Prime
 */
public class Main {

    public int size;
    public int[] mx;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.mx = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.mx[i] = sc.nextInt();
        }
    }

    public void taskA() {
        // long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < this.size; i++) {
            boolean flg = false;
            int sqrt = (int) (Math.sqrt(this.mx[i]));
            for (int j = 2; j <= sqrt; j++) {
                if (mx[i] % j == 0) {
                    flg = true;
                    break;
                }
            }
            if (!flg) {
                count++;
            }
        }
        // long end = System.currentTimeMillis();
        System.out.println(count);
        // System.out.println((end - start) + "ms");
    }

    public void taskB() {
        long start = System.currentTimeMillis();
        boolean[] eratosthenes = new boolean[100000000];
        eratosthenes[0] = true;
        for (int i = 2; i <= 100000000; i++) {
            int j = i;
            while (j <= 100000000) {
                if (!eratosthenes[j - 1]) {
                    eratosthenes[j - 1] = true;
                }
                j += i;
            }
            System.out.println("end: " + i);
        }
        int count = 0;
        for (int i = 1; i < this.size; i++) {
            if (!eratosthenes[i]) {
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println((end - start) + "ms");
    }

    public static void main(String[] args) {
        Main prime = new Main();
        prime.scan();
        prime.taskA();
    }
}
