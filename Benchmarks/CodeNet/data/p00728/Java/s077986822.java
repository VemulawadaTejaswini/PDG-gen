import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {
        int num = sc.nextInt();
        if (num == 0) {
            break;
        }
        int max = 0;
        int min = 1000;
        int scoreSum = 0;
        for (int j = 0; j < num; j++) {
            int score = sc.nextInt();
            scoreSum += score;
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }
        scoreSum -= max;
        scoreSum -= min;

        num -= 2;

        System.out.println(scoreSum / num);
    }
    }
}
