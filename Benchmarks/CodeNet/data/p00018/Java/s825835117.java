import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String BLANK = " ";

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = in.readLine();

            String[] dataStr = input.split(BLANK);

            List<Integer> dataList = new ArrayList<Integer>();

            for (String str : dataStr) {
                dataList.add(Integer.valueOf(str));
            }

            List<Integer> resultList = mergeSort(dataList);

            StringBuilder resultBuilder = new StringBuilder();

            for (Integer result : resultList) {
                resultBuilder.append(result).append(BLANK);
            }

            resultBuilder.delete(resultBuilder.length() - 1,
                    resultBuilder.length());

            System.out.println(resultBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static List<Integer> mergeSort(List<Integer> dataList) {

        if (dataList.size() == 1) {
            return dataList;
        }

        List<Integer> leftList = mergeSort(dataList.subList(0,
                dataList.size() / 2));
        List<Integer> rightList = mergeSort(dataList.subList(
                dataList.size() / 2, dataList.size()));

        int leftCnt = 0;
        int rightCnt = 0;
        List<Integer> resultList = new ArrayList<Integer>();

        for (int i = 0; i < leftList.size() + rightList.size(); i++) {

            if (rightCnt == rightList.size()) {
                resultList.add(leftList.get(leftCnt));
                leftCnt++;
            } else if (leftCnt == leftList.size()) {
                resultList.add(rightList.get(rightCnt));
                rightCnt++;
            } else if (leftList.get(leftCnt).compareTo(rightList.get(rightCnt)) > 0) {
                resultList.add(leftList.get(leftCnt));
                leftCnt++;
            } else {
                resultList.add(rightList.get(rightCnt));
                rightCnt++;
            }
        }

        return resultList;
    }
}