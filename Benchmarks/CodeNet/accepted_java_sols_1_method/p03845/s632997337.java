import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(final String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            int questionCount = Integer.parseInt(br.readLine());
            List<String> questionTimeString = Arrays.asList(br.readLine().split(" "));
            int drinkCount = Integer.parseInt(br.readLine());
            List<List<String>> drinkTimeAndQuestionNumberString = new ArrayList<>();
            for (int i = 0; i < drinkCount; i++) {
                drinkTimeAndQuestionNumberString.add(Arrays.asList(br.readLine().split(" ")));
            }

            List<Integer> questionTime = new ArrayList<>();
            for (int i = 0; i < questionCount; i++) {
                questionTime.add(Integer.parseInt(questionTimeString.get(i)));
            }

            List<Integer> drinkTimeAndQuestionNumber = new ArrayList<>();
            for (List<String> list : drinkTimeAndQuestionNumberString) {
                for (String str : list) {
                    drinkTimeAndQuestionNumber.add(Integer.parseInt(str));
                }
            }

            for (int i = 0; i < drinkTimeAndQuestionNumber.size(); i += 2) {
                int sumTime = 0;
                for (int j = 0; j < questionCount; j++) {
                    if (drinkTimeAndQuestionNumber.get(i) - 1 == j) {
                        sumTime += drinkTimeAndQuestionNumber.get(i + 1);
                    } else {
                        sumTime += questionTime.get(j);
                    }
                }
                System.out.println(sumTime);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}