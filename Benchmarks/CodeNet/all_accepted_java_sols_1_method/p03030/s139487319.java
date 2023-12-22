import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
        Map<Integer, String> scoreMap = new HashMap<Integer, String>();
        Set<String> citySet = new TreeSet<String>();
        for (int i = 0; i < N; i++) {
            String city = sc.next();
            int score = sc.nextInt();
            citySet.add(city);
            scoreMap.put(score, city);
            resMap.put(score, i + 1);
        }

        for (String city : citySet) {
            List<Integer> scoreList = new ArrayList<Integer>();
            for (int score : scoreMap.keySet()) {
                if (city.equals(scoreMap.get(score))) {
                    scoreList.add(score);
                }
            }
            Collections.sort(scoreList, Collections.reverseOrder());
            for (int score : scoreList) {
                System.out.println(resMap.get(score));
            }
        }
    }
}
