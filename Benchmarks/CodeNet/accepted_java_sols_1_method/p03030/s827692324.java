import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // Key:restranの名前 Value:indexとscoreのMap
        Map<String, Map<Integer, Integer>> scoreTree = new TreeMap<>();

        int N;
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        for(int i = 1; i <= N; i++){
            String name;
            int score;
            name = scanner.next();
            score = scanner.nextInt();

            if(scoreTree.containsKey(name)){
                scoreTree.get(name).put(score, i);
            } else {
                // Key:score Value:index
                Map<Integer, Integer> restrant = new TreeMap<>();
                restrant.put(score, i);
                scoreTree.put(name, restrant);
            }
        }

        for (String name : scoreTree.keySet()) {
            List<Integer> list = new ArrayList<>();
            for (Integer index : scoreTree.get(name).values()){
                list.add(index);
            }
            for(int i = list.size() - 1; i >= 0; i--){
                System.out.println(list.get(i));
            }
        }

        scanner.close();

    }
}
