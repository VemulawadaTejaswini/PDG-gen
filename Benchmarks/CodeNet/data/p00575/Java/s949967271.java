import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new SocialGame(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).calcDays_to_earn_goal_coins());
        scanner.close();
    }
}

class SocialGame {
    private int daily_coin = 0;
    private int weekly_coin = 0;
    private int goal_coin = 0;

    public SocialGame(int daily_coin, int weekly_coin, int goal_coin) {
        this.daily_coin = daily_coin;
        this.weekly_coin = weekly_coin;
        this.goal_coin = goal_coin;
    }

    public int calcDays_to_earn_goal_coins() {
        int remain_coin = goal_coin;
        int passed_days = 0;
        while(true) {
            passed_days += 1;
            remain_coin -= daily_coin;

            if(passed_days % 7 == 0) {
                remain_coin -= weekly_coin;
            }

            if(remain_coin <= 0) {
                return passed_days;
            }
        }
    }
}
