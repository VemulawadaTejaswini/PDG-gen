import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        long H = Long.parseLong(sc.next());
        int exp = (int) Math.floor(Math.log(H) / Math.log(2));
        long result = 0;
        for (int i = 0; i <= exp; i++) {
            result += Math.pow(2, i);
        }
        System.out.println(result);
    }
}
