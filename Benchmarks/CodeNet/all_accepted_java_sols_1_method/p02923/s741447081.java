import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int currentStreak = 0;
        int prev = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int h = in.nextInt();
            if(h<=prev) {
                currentStreak++;
            }
            else {
                max = Math.max(max, currentStreak);
                currentStreak = 0;
            }
            prev = h;
        }
        max = Math.max(max, currentStreak);
        System.out.println(max);
    }
}
