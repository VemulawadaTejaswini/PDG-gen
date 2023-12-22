import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A - Can't Wait for Holiday

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String yobi[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        for (int i = 0; i < 7; i++) {
            if (s.equals(yobi[i])) {
                System.out.println(Math.abs(i - 7));
                break;
            }
        }
    }
}