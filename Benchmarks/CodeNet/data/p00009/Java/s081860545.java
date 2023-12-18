import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new LinkedList<String>();
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (String inputDataStr : inputDataList) {
            System.out.println(findPrimeNumber(inputDataStr));
        }
    }

    private static int findPrimeNumber(String inputDataStr) {

        int inputData = Integer.parseInt(inputDataStr);
        int count = 0;

        // 1は素数でないので、2〜から探索
        for (int i = 2; i <= inputData; i++) {
            if (isPrimeNumber(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrimeNumber(int i) {

        for (int j = 2; j < i; j++) {

            // 割り切れる→素数でない。
            if (i % j == 0) {
                return false;
            }
        }

        // 割り切れない→素数
        return true;
    }
}