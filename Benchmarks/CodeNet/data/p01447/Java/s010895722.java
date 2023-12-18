import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int i = 1;
        int n = scn.nextInt();
        while(n > (int)Math.ceil(Math.pow(3, i))) {
            i++;
        }
        System.out.println(i);
    }
}