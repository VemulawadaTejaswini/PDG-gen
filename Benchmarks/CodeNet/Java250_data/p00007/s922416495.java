import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        double d = 100;
        for(int i = 0; i < n; i++) {
            d = Math.ceil(d * 1.05);
        }
        System.out.println((int)d * 1000);
    }
}