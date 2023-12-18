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

        //エラー回避のため、1以下の値は一律0を返す。
        if(inputData < 2) {
            return 0;
        }

        //2〜入力値までの素数判定用フラグ格納配列 true : 素数である。 false : 素数でない。
        boolean[] isPrimeNumber = new boolean[inputData + 1];

        //1は素数でないので、2から探索
        for(int i = 2; i <= inputData; i++) {

            //素数ならば次の数へ
            if(isPrimeNumber[i]) {
                continue;
            }

            count++;

            //iの倍数のフラグをtrueに変更
            for(int j = i * 2; j <= inputData; j = j + i) {
                isPrimeNumber[j] = true;
            }
        }
        return count;
    }
}