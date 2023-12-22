import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String[] days = new String[] {
            "SUN",
            "MON",
            "TUE",
            "WED",
            "THU",
            "FRI",
            "SAT"
        };

        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(S)) {
                System.out.println(7 - i);
                System.exit(0);
            }
        }
    }
}
