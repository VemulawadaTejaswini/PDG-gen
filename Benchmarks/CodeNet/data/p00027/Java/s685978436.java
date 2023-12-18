import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final String[] WEEK;
    private static final int[] DAYS;
    
    static {
        String[] sary = {
            "Wednesday", "Thursday", "Friday",
            "Saturday", "Sunday", "Monday", "Tuesday"
        };
        WEEK = sary;
        int[] iary = {
            0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        DAYS = iary;
    }
    
    public static void main(String[] args) {
        int m, d;
        while((m = scn.nextInt()) > 0) {
            d = scn.nextInt();
            for(int i = 1; i < m; i++) {
                d += DAYS[i];
            }
            System.out.println(WEEK[d % 7]);
        }
    }
}