import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<String>();

        int[] counter = new int[26];
        for (int i = 0; i < 26; i++) {
            counter[i] = 0;
        }

        while (sc.hasNext()) {
            s.add(sc.nextLine().toLowerCase());
        }

        for (int j = 0; j < s.size(); j++) {
            for (int i = 0; i < s.get(j).length(); i++) {
                char c = s.get(j).charAt(i);
                if (c >= 97 && c <= 122) {
                    counter[c - 97]++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i + 97) + " : " + counter[i]);
        }
        sc.close();
    }
}
