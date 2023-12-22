import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("/");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int date = Integer.parseInt(s[2]);

        String result = "TBD";
        if (year <= 2019 && month <= 4 && date <= 30) {
            result = "Heisei";
        }

        System.out.println(result);
    }
}