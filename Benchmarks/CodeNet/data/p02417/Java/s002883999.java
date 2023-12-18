import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[26];
        while(scanner.hasNext()) {
            String word = scanner.nextLine().toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (97 <= c && c <= 122) {
                    counts[c - 97] += 1;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            char c = (char)(97 + i);
            System.out.printf("%c : %d\n", c, counts[i]);
        }
        
        scanner.close();
    }
}

