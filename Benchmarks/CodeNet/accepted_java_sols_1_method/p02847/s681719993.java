import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sarr = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for (int i = sarr.length - 1; i >= 0; i--) {
            if (s.equals(sarr[i])) {
                System.out.println(sarr.length - i);
            }
        }
    }

}
