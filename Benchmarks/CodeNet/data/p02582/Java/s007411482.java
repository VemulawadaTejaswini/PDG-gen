import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int longestStreak = 0;
        int currentStreak = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'S') {
                currentStreak = 0;
            } else {
                currentStreak++;
                if (currentStreak > longestStreak) { 
                    longestStreak = currentStreak;
                }
            }
        }
        System.out.println(longestStreak);
    }
}
