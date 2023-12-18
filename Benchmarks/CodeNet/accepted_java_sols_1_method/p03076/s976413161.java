import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    // Five Dishes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTime = 0;
        int adjustment = 10;
        for (int i = 0; i < 5; i++) {
            int time = sc.nextInt();
            totalTime += time + (time % 10 == 0 ? 0 : 10 - time % 10);
            if (time % 10 != 0 && time % 10 < adjustment) {
                adjustment = time % 10;
            }
        }
        totalTime -= (10 - adjustment);
        System.out.println(totalTime);
    }
}
