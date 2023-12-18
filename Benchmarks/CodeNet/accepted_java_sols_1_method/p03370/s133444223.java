import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int lightDonut = X;
        for (int i = 0; i < N ; i++) {
            int m = sc.nextInt();
            X -= m;
            lightDonut = Math.min(lightDonut, m);
        }
        System.out.println(N + X/lightDonut);
    }

}