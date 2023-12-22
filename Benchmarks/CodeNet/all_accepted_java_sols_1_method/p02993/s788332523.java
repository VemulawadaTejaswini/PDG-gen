import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cL = s.toCharArray();
        for (int i = 1; i< cL.length;i++) {
            if (cL[i-1] == cL[i]) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}