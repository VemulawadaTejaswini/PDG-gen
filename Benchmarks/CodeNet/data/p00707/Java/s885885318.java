import java.util.Scanner;
 
 
public class Main {
    Scanner in = new Scanner(System.in);
    char[][] map;
     
    String compare(String s1, String s2) {
        if (s1.length() > s2.length()) return s1;
        else if (s1.length() < s2.length()) return s2;
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i)) return s1;
                else if (s1.charAt(i) < s2.charAt(i)) return s2;
            }
        }
        return s1;
    }
     
    public String recursive(int x, int y, String ans) {
        if ((map[y][x] >= 'A' && map[y][x] <= 'Z') || map[y][x] == 0) return "";
        ans += map[y][x] + "";
        String s1 = recursive(x+1, y, ans);
        String s2 = recursive(x, y+1, ans);
        String a = compare(s1, s2);
        return (a.equals("")) ? ans : a;
    }
     
    public Main() {
        while (true) {
            int m = in.nextInt();
            int n = in.nextInt();
            if (m == 0 && n == 0) break;
            map = new char[n+1][m+1];
            for (int i = 0; i < n; i++) {
                String s = in.next();
                for (int j = 0; j < m; j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            String ans = "";
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 1; j++) {
                    String temp = recursive(i, j, "");
                    int k;
                    for (k = 0; k < temp.length(); k++) {
                        if (temp.charAt(k) != '0') break;
                    }
                    temp = temp.substring(k, temp.length());
                    ans = compare(temp, ans);
                }
            }
            System.out.println(ans);
        }
    }
     
    public static void main(String[] args) {
        new Main();
    }
 
}