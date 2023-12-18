import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int result = 7;
        for (int i = 0; i < weeks.length; i++) {
            if (weeks[i].equals(s)) {
                result -= i;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
