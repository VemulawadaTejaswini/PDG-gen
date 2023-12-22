import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int days = 0;
            switch (sc.next()) {
            case "MON":
                days++;
            case "TUE":
                days++;
            case "WED":
                days++;
            case "THU":
                days++;
            case "FRI":
                days++;
            case "SAT":
                days++;
                break;
            case "SUN":
                days = 7;
            }
            System.out.println(days);
        }
    }
}