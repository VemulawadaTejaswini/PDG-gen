import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int n = Integer.parseInt(number);
        ArrayList<Integer> aveList = new ArrayList<Integer>();

        while (n != 0) {
            ArrayList<Integer> numList = new ArrayList<Integer>();
            int sum = 0;
            String input;
            int num;
            for (int i = 1; i <= n; i++) {
                input = scanner.next();
                num = Integer.parseInt(input);
                numList.add(num);
                sum += num;
            }

            // 最大値、最小値を求める
            Integer max = Collections.max(numList);
            Integer min = Collections.min(numList);

            sum = sum - max - min;

            int ave = sum / (numList.size() - 2);
//            System.out.println(ave);

            aveList.add(ave);

            number = scanner.next();
            n = Integer.parseInt(number);
        }

        for(Integer value : aveList)
        {
            System.out.println(value);
        }
        }

}

