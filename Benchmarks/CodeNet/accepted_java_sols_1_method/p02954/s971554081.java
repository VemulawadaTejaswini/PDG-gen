import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.next().toCharArray();
        int[] children = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            children[i] = 0;
        }

        int j = 0;
        while (s[++j] != 'L');

        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'R') {
                if (0 < i && s[i - 1] != 'R') {
                    for (j = i + 1; j < s.length; j++) {
                        if (s[j] == 'L')
                            break;
                    }
                }
                if ((j - i) % 2 == 1) {
                    children[j - 1]++;
                } else {
                    children[j]++;
                }
            } else {
                if (s[i - 1] != 'L') {
                    for (j = i - 1; j >= 0; j--) {
                        if (s[j] == 'R')
                            break;
                    }
                }
                if ((i - j) % 2 == 1) {
                    children[j + 1]++;
                } else {
                    children[j]++;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(children[i] + " ");
        }
    }
}

