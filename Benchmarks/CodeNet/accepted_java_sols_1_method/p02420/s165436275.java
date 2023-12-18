import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        String str;
        while(!(str = scn.next()).equals("-")) {
            int lim = scn.nextInt();
            for(int i = 0; i < lim; i++) {
                int n = scn.nextInt();
                str = str.substring(n) + str.substring(0, n);
            }
            System.out.println(str);
        }
    }
}