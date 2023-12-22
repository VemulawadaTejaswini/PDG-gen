import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] ch = sc.next().toCharArray();
        char ans = 97; // 97 == 'a'
        
        Arrays.sort(ch);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ans) {
                ++ans;
            } else if (ch[i] > ans) {
                break;
            }
        }
        out.println(ans < 123 ? ans : "None"); // 122 == 'z'

        out.flush();
    }
}