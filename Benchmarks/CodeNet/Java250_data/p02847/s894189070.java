import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        int day = 0;

        switch (S) {
            case "SUN":
                day = 7;
                break;
            case "MON":
                day = 6;
                break;
            case "TUE":
                day = 5;
                break;
            case "WED":
                day = 4;
                break;
            case "THU":
                day = 3;
                break;
            case "FRI":
                day = 2;
                break;
            case "SAT":
                day = 1;
                break;
            default:
                break;
        }

        System.out.print(day);
    }
}