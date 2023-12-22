import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        final String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        for (int i = 0; i < weeks.length; i++) {
            if (s.contains(weeks[i])){
                System.out.println(7 - i);
                break;
            }
        }
    }
}