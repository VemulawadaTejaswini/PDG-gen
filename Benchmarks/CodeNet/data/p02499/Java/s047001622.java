import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            counts.put(ch, 0); 
        }

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            for (char rawCh : line.toCharArray()) {
                char ch = Character.toLowerCase(rawCh);
                if (counts.containsKey(ch)) {
                    int nextCount = counts.get(ch)+1; 
                    counts.put(ch, nextCount);
                }
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = counts.get(ch);
            System.out.printf("%c : %d\n", ch, count);
        }
    }
}