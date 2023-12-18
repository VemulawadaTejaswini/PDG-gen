import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            char text[] = sc.nextLine().toCharArray();
            int alpha = 0;
            int beta = 0;
            for (int a = 0; a <= 100; a++) {
                for (int b = 0; b <= 100; b++) {
                    Set<Character> set = new HashSet<Character>();
                    Map<Character, Character> map = new HashMap<Character, Character>();
                    for (int i = 0; i < 26; i++) {
                        set.add((char) ('a' + ((a * i + b) % 26)));
                        map.put((char) ('a' + i),
                                (char) ('a' + ((a * i + b) % 26)));
                    }
                    if (set.size() == 26) {
                        StringBuilder sb = new StringBuilder();
                        for (int j = 0; j < text.length; j++) {
                            if (text[j] != ' ')
                                sb.append(map.get(text[j]));
                            else
                                sb.append(' ');
                        }
                        String str = sb.toString();
                        if (str.matches(".*" + "this" + ".*")
                                || str.matches(".*" + "that" + ".*")) {
                            System.out.println(str);
                            a = 101;
                            break;
                        }
                    }
                }
            }
            n--;
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}