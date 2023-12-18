import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        String W = input.next();
        int count = 0;
        while (true) {
            String T = input.next();
            if ("END_OF_TEXT".equals(T)) break;
            if (W.equalsIgnoreCase(T)) count++;
        }
        System.out.println(count);
    }
}