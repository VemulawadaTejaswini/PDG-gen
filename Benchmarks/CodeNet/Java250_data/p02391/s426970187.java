import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a = scn.nextInt(), b = scn.nextInt();
        System.out.println("a " + (a < b ? "<" : (a > b ? ">" : "==")) + " b");
    }
}