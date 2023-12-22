import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int nextSat = -1;
        for(int i = 0; i < days.length; i++) {
            if (S.equals(days[i])) {
                nextSat = S.equals(days[0]) ? days.length : days.length - i;
            }
        }
        System.out.println(nextSat);
    }

}
