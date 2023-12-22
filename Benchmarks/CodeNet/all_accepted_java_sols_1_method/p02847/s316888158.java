

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final String input = sc.next();
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for (int i = 0; i < days.length; i++) {
            if (input.equals(days[i])) {
                System.out.println(7 - i);
                break;
            }
        }
    }
}
