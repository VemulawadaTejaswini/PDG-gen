import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {

        Scanner sc = null;
		Map<String, Integer> countTheFrequency = new TreeMap<String, Integer>();
        try {
            sc = new Scanner(System.in);
            String[] words = sc.nextLine().split(" ");

            int mostFrequent = 0;
            int longest = 0;
            String mostFrequentWord = "";
            String longestWord = "";
            for (String word : words) {
                countTheFrequency.put(word, countTheFrequency.containsKey(word) ? countTheFrequency.get(word) + 1 : 1);
                if (mostFrequent < countTheFrequency.get(word)) {
                    mostFrequent = countTheFrequency.get(word);
                    mostFrequentWord = word;
                }
                if (longest < word.length()) {
                    longest = word.length();
                    longestWord = word;
                }
            }

            System.out.println(mostFrequentWord + " " + longestWord);

        } finally {
            sc.close();
        }
    }
}