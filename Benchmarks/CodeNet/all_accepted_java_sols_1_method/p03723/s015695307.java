import java.util.Scanner;

/**
 * Created by zzt on 17-5-6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curA = scanner.nextInt();
        int curB = scanner.nextInt();
        int curC = scanner.nextInt();
        int time = 0;

        if (curA == curB && curA == curC && curA % 2 == 0) {
            System.out.println(-1);
            return;
        }
        int tempA = 0, tempB = 0, tempC = 0;
        while (curA % 2 == 0 && curB % 2 == 0 && curC % 2 == 0) {
            tempA = curB / 2 + curC / 2;
            tempB = curA / 2 + curC / 2;
            tempC = curA / 2 + curB / 2;
            curA = tempA;
            curB = tempB;
            curC = tempC;
            time++;
        }
        System.out.println(time);
    }
}