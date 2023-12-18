import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String s[] = new String[h + 2];
        s[0] = "";
        s[h + 1] = "";
        for (int i = 0; i < w + 2; i++) {
            s[0] += " ";
            s[h + 1] += " ";
        }
        for (int i = 1; i < h + 1; i++) {
            s[i] = " " + sc.next() + " ";
        }
        char c[][] = new char[h][w];

        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (s[i].charAt(j) == '#') {
                    c[i - 1][j - 1] = '#';
                } else {
                    int count = 0;
                    if (s[i - 1].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (s[i - 1].charAt(j) == '#') {
                        count++;
                    }
                    if (s[i - 1].charAt(j + 1) == '#') {
                        count++;
                    }
                    if (s[i].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (s[i].charAt(j + 1) == '#') {
                        count++;
                    }
                    if (s[i + 1].charAt(j - 1) == '#') {
                        count++;
                    }
                    if (s[i + 1].charAt(j) == '#') {
                        count++;
                    }
                    if (s[i + 1].charAt(j + 1) == '#') {
                        count++;
                    }
                    c[i - 1][j - 1] = (char)(count + '0');
                }
            }
        }
        for (int i = 0; i < h; i++) {
            System.out.println(c[i]);
        }
    }
}
