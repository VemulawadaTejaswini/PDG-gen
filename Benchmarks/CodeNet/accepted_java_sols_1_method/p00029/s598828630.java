import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> word = new HashMap<>();
        int longest = 0, mostFrequent = 0;
        String longestStr = "", mostFrequentStr = "";
        try {
            while (true) {
                String input = br.readLine();
                if (input == null) break;
                String[] line = input.split(" ");
                for (String str : line) {
                    if (word.get(str) == null) {
                        word.put(str, 1);
                    } else {
                        word.put(str, word.get(str) + 1);
                    }
                    if (str.length() > longest) {
                        longest = str.length();
                        longestStr = str;
                    }
                    if (word.get(str) > mostFrequent) {
                        mostFrequent = word.get(str);
                        mostFrequentStr = str;
                    }
                }
            }
        } finally {
            br.close();
        }
        System.out.println(mostFrequentStr + " " + longestStr);
    }
}