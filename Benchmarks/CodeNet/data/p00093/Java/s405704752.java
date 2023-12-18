import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
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
            String[] years = inputData.split(" ");
            int start = Integer.parseInt(years[0]);
            int end = Integer.parseInt(years[1]);

            if (start == 0 && end == 0) {
                break;
            }

            searchLeapYear(start, end);
            System.out.println();
        }
    }

    private static void searchLeapYear(int start, int end) {
        List<Integer> leapYearList = new LinkedList<Integer>();
        for (int i = start; i <= end; i++) {
            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    leapYearList.add(i);
                } else {
                    if (i % 400 == 0) {
                        leapYearList.add(i);
                    }
                }
            }
        }

        if (leapYearList.size() != 0) {
            for (Integer year : leapYearList) {
                System.out.println(year);
            }
        } else {
            System.out.println("NA");
        }
    }
}