
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        switch (s) {
            case "SUN":
                System.out.println(7);
                break;
            case "MON":
                System.out.println(6);
                break;
            case "TUE":
                System.out.println(5);
                break;
            case "WED":
                System.out.println(4);
                break;
            case "THU":
                System.out.println(3);
                break;
            case "FRI":
                System.out.println(2);
                break;
            case "SAT":
                System.out.println(1);
                break;
        }

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
