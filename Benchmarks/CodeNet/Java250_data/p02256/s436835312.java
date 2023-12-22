import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int x = scn.nextInt(), y = scn.nextInt();
        System.out.println(euclid(x > y ? x : y, x < y ? x : y));
    }
    
    private static int euclid(int x, int y) {
        if(y > 0) {
            return euclid(y, x % y);
        } else {
            return x;
        }
    }
}