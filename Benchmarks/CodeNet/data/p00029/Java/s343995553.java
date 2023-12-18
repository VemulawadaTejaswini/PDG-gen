
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

  public void run() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();

    //?????????????????????
    HashMap<String, Integer> usedWordCount = new HashMap<>();
    String[] splitedSentence = in.split(" ");
    for (String word : splitedSentence) {
      if (usedWordCount.containsKey(word))
        usedWordCount.put(word, usedWordCount.get(word) + 1);
      else
        usedWordCount.put(word, 1);
    }

    //???????????¨??????????????????????????????
    Entry<String, Integer> modeOfWord = usedWordCount
            .entrySet()
            .stream()
            .max((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> o1.getValue() < o2.getValue() ? -1 : o1.getValue() == o2.getValue() ? 0 : 1)
            .get();

    //??????????????°????????????????????????
    Entry<String, Integer> maxLengthWord = usedWordCount
            .entrySet()
            .stream()
            .max((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> o1.getKey().length() < o2.getKey().length() ? -1 : o1.getKey().length() == o2.getKey().length() ? 0 : 1)
            .get();

    //??????
    System.out.println(modeOfWord.getKey());
    System.out.println(maxLengthWord.getKey());
    
    /*
     while ((in = reader.readLine()) != null) {
      
     }
     */
  }

  public static void main(String[] args) throws IOException {
    Main main = new Main();
    main.run();
  }

}