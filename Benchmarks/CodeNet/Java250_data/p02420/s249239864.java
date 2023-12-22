import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        while (true) {
            char[] cs = input.next().toCharArray();
            if (cs.length == 1 && cs[0] == '-') break;
            int m = input.nextInt();
            for (int i = 0; i < m; i++) {
                int h = input.nextInt();
                char[] temp = new char[h];
                for (int j = 0; j < h; j++) {
                    temp[j] = cs[j];
                }
                for (int j = h; j < cs.length; j++) {
                    cs[j - h] = cs[j];
                }
                for (int j = cs.length - h; j < cs.length; j++) {
                    cs[j] = temp[j - (cs.length - h)];
                }
            }
            System.out.println(cs);
        }
    }
}