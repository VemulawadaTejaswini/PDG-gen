import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String odd = "RUD";
        String even = "LUD";
        boolean rslt = true;

        for (int i = 1; i <= s.length(); i++) {
            if (i%2==0) {
                if (!even.contains(s.substring(i-1, i))) {
                    rslt = false;
                    break;
                }
            } else {
                if (!odd.contains(s.substring(i-1, i))) {
                    rslt = false;
                    break;
                }
            }
        }
        System.out.println(rslt? "Yes": "No");
    }
}