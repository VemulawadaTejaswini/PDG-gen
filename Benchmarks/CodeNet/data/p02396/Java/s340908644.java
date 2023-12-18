import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int i = 1, x; (x = scn.nextInt()) != 0; i++) {
            System.out.println("Case " + i + ": " + x);
        }
    }
}