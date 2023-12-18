import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yousack
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(solve(in.next()));
        }
    }
    
    public static String solve(String s) {
        char[][] table = new char[][] {
                {},
                {'.', ',', '!', '?', ' '},
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };
        
        String result = "";
        List<Character> feed = new ArrayList<Character>();
        
        for (char c : s.toCharArray()) {
            if (c != '0') {
                feed.add(c);
            } else {
                if (!feed.isEmpty()) {
                    int num = Integer.parseInt(feed.get(0).toString());
                    result += table[num][(feed.size() - 1) % table[num].length];
                }
                
                feed.clear();
            }
        }
        
        return result;
    }
}