import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int s = 0;
        int buf = n;
        while (buf > 0) {
            s += buf % 10;
            buf /= 10;
        }
        System.out.println(n % s == 0 ? "Yes" : "No");
        reader.close();
    }
}