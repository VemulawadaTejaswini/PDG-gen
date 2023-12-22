import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        if(s.length() <= K) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0,K) + "...");
        }
    }
}