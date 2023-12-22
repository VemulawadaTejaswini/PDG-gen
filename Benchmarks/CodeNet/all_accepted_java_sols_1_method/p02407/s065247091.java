import java.util.*;
 
public class Main {
    private static final Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) {
        int n = scn.nextInt();
        String str = scn.next();
        for(int i = 1; i < n; i++) {
            str = new String(scn.next() + " " + str);
        }
        System.out.println(str);
    }
}