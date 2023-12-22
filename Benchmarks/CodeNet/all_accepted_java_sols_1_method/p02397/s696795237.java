import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int x, y; (x = scn.nextInt()) != 0 | (y = scn.nextInt()) != 0;) {
            System.out.println((x < y ? x : y) + " " + (x > y ? x : y));
        }
    }
}