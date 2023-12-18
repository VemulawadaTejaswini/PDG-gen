import java.util.Scanner;
import java.math.*;
 
public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void main(String args[]) {
                for(int i = 0, N = sc.nextInt(); i < N; i++) {
                        String s = new BigInteger(sc.next()).add(new BigInteger(sc.next())).toString();
                        System.out.println(s.length() > 80 ? "overflow" : s);
                }
        }
}