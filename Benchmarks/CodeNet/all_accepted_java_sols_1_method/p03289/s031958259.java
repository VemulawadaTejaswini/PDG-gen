import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        int idx = 0;
        for (int i = 2; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'C') {
                idx = i;
                break;
            }
        }
        boolean allLower = true;
        for (int i = 1; i < s.length(); i++) {
            if(i != idx && s.charAt(i) < 97) {
                allLower = false;
            }
        }
        if (s.charAt(0) == 'A' && idx != 0 && allLower) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}