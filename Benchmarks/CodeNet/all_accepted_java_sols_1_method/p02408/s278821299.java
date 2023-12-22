
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cardCount = Integer.parseInt(reader.readLine());

        String[] marks = {"S", "H", "C", "D"};
        Map<String,List<Integer>> cards = new HashMap<String,List<Integer>>();
        for (String mark : marks) {
            cards.put(mark, new ArrayList<Integer>());
        }

        for (int i = 0; i < cardCount; i++) {
            String line = reader.readLine();
            String[] in = line.split(" ");
            if (cards.containsKey(in[0]))  {
                cards.get(in[0]).add(Integer.parseInt(in[1]));
            }
        }

        for (String mark : marks) {
            List<Integer> cardList = cards.get(mark);
            for (int i = 1; i <= 13; i++) {
                if (!cardList.contains(i)) {
                    System.out.println(mark + " " + i);
                }
            }
        }
   }
}