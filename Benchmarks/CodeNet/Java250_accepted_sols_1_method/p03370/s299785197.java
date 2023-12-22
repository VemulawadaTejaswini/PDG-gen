import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        int n = sc.nextInt();
        // get two integers separated with half-width break
        int x = sc.nextInt();

        int m[] = new int[100];

        int smallest = 999999;
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int mi = sc.nextInt();
            sum += mi;
            m[i] = mi;
            if (mi < smallest) {
                smallest = mi;
            }
        }


        int rest = x - sum;
        int additional = rest / smallest;
        int result = n + additional;

        System.out.println(result);
    }

}