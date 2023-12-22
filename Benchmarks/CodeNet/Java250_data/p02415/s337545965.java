import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        char[] cs = input.nextLine().toCharArray();
        int d = 'A' - 'a';
        for (int i = 0; i < cs.length; i++) {
            if ('A' <= cs[i] && cs[i] <= 'Z') {
                cs[i] -= d;
            } else if ('a' <= cs[i] && cs[i] <= 'z') {
                cs[i] += d;
            }
        }
        System.out.println(cs);
    }
}