import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();

        int counter = 0;

        while (--N >= 0) {
            int height = s.nextInt();

            if (height >= K)
                counter++;
        }

        System.out.println(counter);
    }
}