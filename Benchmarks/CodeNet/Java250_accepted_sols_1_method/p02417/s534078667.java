import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        for (int i = 0; i < 26; i++)
            count[i] = 0;

        while(sc.hasNext()){
            String input = sc.nextLine();
            String lowed = input.toLowerCase();
            for (int i = 0; i < lowed.length(); i++) {
                if (lowed.charAt(i) >= 'a' && lowed.charAt(i) <= 'z')
                    count[lowed.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++)
            System.out.println((char) ('a' + i) + " : " + count[i]);
    }
}
