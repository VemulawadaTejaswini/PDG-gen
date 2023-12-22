import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(scn.hasNextInt()) {
            System.out.println(
              (scn.nextInt() + scn.nextInt() + "").length()
            );
        }
    }
}