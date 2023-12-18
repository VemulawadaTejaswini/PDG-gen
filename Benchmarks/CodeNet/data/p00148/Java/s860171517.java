import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            System.out.format("3C%02d\n", ((scn.nextInt() - 1) % 39 + 1));
        }
    }
}