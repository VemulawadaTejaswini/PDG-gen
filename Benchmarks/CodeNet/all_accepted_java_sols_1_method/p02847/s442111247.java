import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        String[] t = {"SUN", "MON","TUE","WED","THU", "FRI","SAT"};
        for (int i = 0; i < 7 ; i++) {
            if (s.equals(t[i])) {
                System.out.println(7 - i);
            }
        }

    }

}