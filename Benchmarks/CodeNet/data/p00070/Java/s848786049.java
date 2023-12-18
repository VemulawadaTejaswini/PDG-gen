import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputDataList = new ArrayList<String>();
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

        for (String inputData : inputDataList) {
            String[] inputDataArray = inputData.split(" ");
            int n = Integer.parseInt(inputDataArray[0]);
            int[] useNum = new int[n];

            for (int i = 0; i < n; i++) {
                useNum[i] = -1;
            }

            int answer = cntNumber(n, Integer.parseInt(inputDataArray[1]),
                    useNum, 0);

            System.out.println(answer);
        }
    }

    private static int cntNumber(int n, int s, int[] useNum, int cnt) {

        if (s < 0) {
            return 0;
        }

        if (n == 1) {
            if (s < 10 && !duplication(s, useNum, cnt)) {
                return 1;
            } else {
                return 0;
            }
        }

        int answer = 0;

        for (int i = 0; i < 10; i++) {

            if (duplication(i, useNum, cnt)) {
                continue;
            }

            useNum[cnt] = i;
            answer = answer + cntNumber(n - 1, s - i * n, useNum, cnt + 1);
        }

        return answer;
    }

    private static boolean duplication(int num, int[] useNum, int cnt) {

        for (int i = 0; i < cnt; i++) {
            if (num == useNum[i]) {
                return true;
            }
        }

        return false;
    }
}