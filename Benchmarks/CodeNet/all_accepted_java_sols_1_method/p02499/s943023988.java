import java.util.*;

public class Main {
    private static int[] counter = new int[26];
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < counter.length ; i++) {
            counter[i] = 0;
        }
        while (scanner.hasNext()) {
               String word = (scanner.next()).toLowerCase();
               for (int i = 0; i < word.length(); i++) {
                   char target = word.charAt(i);
                   if ('a' <= target && target <= 'z') {
                       counter[target-'a']++;
                   }
               }
        }
        for( int i = 0; i < counter.length; i++) {
            System.out.println((char)(i + 'a') + " : "+ counter[i] );
        }
    }
}