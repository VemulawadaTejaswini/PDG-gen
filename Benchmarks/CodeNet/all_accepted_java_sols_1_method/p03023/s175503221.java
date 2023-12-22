import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float N = (float)sc.nextInt();
        sc.close();

        float tmp = 180;

        float result = (180 - (360 / N)) * N;

        System .out.println((int)result);

    }
}
