import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Double> inputDataList = new ArrayList<Double>();
        String input = null;

        try {
            while ((input = in.readLine()) != null) {
                inputDataList.add(Double.parseDouble(input));
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

        List<Double> resultList = sort(inputDataList);

        System.out.println(resultList.get(0)
                - resultList.get(resultList.size() - 1));
    }

    private static List<Double> sort(List<Double> inputDataList) {

        if (inputDataList.size() == 1) {
            return inputDataList;
        }

        List<Double> firstHalfList = sort(inputDataList.subList(0,
                inputDataList.size() / 2));
        List<Double> secondHalfList = sort(inputDataList.subList(
                inputDataList.size() / 2, inputDataList.size()));

        int firstHalfListPosition = 0;
        int secondHalfListPosition = 0;
        List<Double> resultList = new ArrayList<Double>(firstHalfList.size()
                + secondHalfList.size());

        while (firstHalfListPosition < firstHalfList.size()
                || secondHalfListPosition < secondHalfList.size()) {

            if(firstHalfListPosition >= firstHalfList.size()) {
                resultList.add(secondHalfList.get(secondHalfListPosition));
                secondHalfListPosition++;
                continue;
            }

            if(secondHalfListPosition >= secondHalfList.size()) {
                resultList.add(firstHalfList.get(firstHalfListPosition));
                firstHalfListPosition++;
                continue;
            }

            if(firstHalfList.get(firstHalfListPosition) > secondHalfList.get(secondHalfListPosition)) {
                resultList.add(firstHalfList.get(firstHalfListPosition));
                firstHalfListPosition++;
            } else {
                resultList.add(secondHalfList.get(secondHalfListPosition));
                secondHalfListPosition++;
            }
        }

        return resultList;
    }

}