import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// C - Welcome to AtCoder
// https://atcoder.jp/contests/abc151/tasks/abc151_c
public class Main {

    static class Result {
        boolean isAC;
        int waCount;

        Result(boolean isAC, int waCount) {
            this.isAC = isAC;
            this.waCount = waCount;
        }

        int getPenaltyCount() {
            return isAC ? waCount : 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        Map<Integer, Result> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int number = Integer.parseInt(scanner.next());
            String acOrWa = scanner.next();
            boolean isAc = acOrWa.equals("AC");

            Result result;
            if (map.containsKey(number)) {
                result = map.get(number);
                if (isAc) {
                    result.isAC = true;
                } else {
                    // AC済はWA出してもカウントしない
                    if (!result.isAC) {
                        result.waCount++;
                    }
                }
            } else {
                result = new Result(isAc, isAc ? 0 : 1);
                map.put(number, result);
            }
        }

        scanner.close();

        int acCount = 0;
        int penaltyCount = 0;
        for (Map.Entry<Integer, Result> entry : map.entrySet()) {
            acCount += entry.getValue().isAC ? 1 : 0;
            penaltyCount += entry.getValue().getPenaltyCount();
        }
        System.out.println(acCount + " " + penaltyCount);
    }
}
