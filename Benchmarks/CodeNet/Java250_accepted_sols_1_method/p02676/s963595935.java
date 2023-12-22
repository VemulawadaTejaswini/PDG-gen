import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String K = scan.next();
        int k = Integer.parseInt(K);
        String s = scan.next();

        int sLen = s.length();

        if (sLen <= k) {
          System.out.println(s);
        } else {
          System.out.println(s.substring(0, k) + "...");
        }
    }
}