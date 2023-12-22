import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int s1 = s / 100;
        int s2 = s % 100;

        boolean isMonth1 = isMonth(s1);
        boolean isMonth2 = isMonth(s2);

        String result;
        if (isMonth1) {
            result = isMonth2 ? "AMBIGUOUS" : "MMYY";
        } else if (isMonth2) {
            result = "YYMM";
        } else {
            result = "NA";
        }
        System.out.println(result);
    }

    private static boolean isMonth(int num) {
        return 1 <= num && num <= 12;
    }
}