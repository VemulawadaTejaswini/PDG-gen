import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int s = scn.nextInt();
        System.out.println(
          s / 3600 + ":" + s % 3600 / 60 + ":" + s % 60
        );
    }
}