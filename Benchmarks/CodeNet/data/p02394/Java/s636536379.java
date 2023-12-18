import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int w = scn.nextInt(), h = scn.nextInt();
        int x = scn.nextInt(), y = scn.nextInt(), r = scn.nextInt();
        System.out.println(
          x - r < 0 || y - r < 0 || x + r > w || y + r > h ? "No" : "Yes"
        );
    }
}