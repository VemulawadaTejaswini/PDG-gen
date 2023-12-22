import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        boolean isOk = true;
        if (s.charAt(0) != 'A') {
            isOk = false;
        }
        String islowerString = s.substring(1);

        int cCount = 0;
//        for (int i = 2; i < s.length() - 1; i++) {
        for (int i = 1; i < islowerString.length() - 1; i++) {
            if (islowerString.charAt(i) == 'C') {
                cCount++;
                islowerString = islowerString.substring(0, i) + islowerString.substring(i + 1);
            }
        }
        if (cCount != 1) {
            isOk = false;
        }

        for (int i = 0; i < islowerString.length(); i++) {
            if (islowerString.charAt(i) < 'a' || islowerString.charAt(i) > 'z') {
                isOk = false;
                break;
            }
        }

        if (isOk) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }

}
