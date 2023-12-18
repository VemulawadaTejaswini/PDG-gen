import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }

        int result = 0;

        boolean shouldContinue = true;
        while(shouldContinue) {
            for (int value : list) {
                if (value % 2 != 0) {
                    shouldContinue = false;
                    break;
                }
            }
            if (shouldContinue) {
                List<Integer> newList = new ArrayList();
                boolean hasPositive = false;
                for (int value : list) {
                    if (value / 2 > 0) {
                        hasPositive = true;
                    }
                    newList.add(value / 2);
                }
                list = newList;
                result++;
                if (!hasPositive) {
                    shouldContinue = false;
                }
            }
        }

        System.out.println(result);
    }
}