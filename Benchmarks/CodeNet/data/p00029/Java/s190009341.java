/**
 * Created by rchen01 on 11/3/17.
 */
import java.io.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sentence = br.readLine().split(" ");

        TreeMap<String, Integer> numbers = new TreeMap<>();

        int maxLength = 0;
        int maxFreq = 0;
        String maxFWord = sentence[0];
        String maxWord = "";
        for (String word : sentence) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
            }
            if(numbers.get(word) == null) {
                numbers.put(word, 1);
            }
            else {
                if(numbers.get(word) > maxFreq) {
                    maxFWord = word;
                }
                numbers.put(word, numbers.get(word) + 1);
            }
        }
        System.out.println(maxFWord + " " + maxWord);
    }
}