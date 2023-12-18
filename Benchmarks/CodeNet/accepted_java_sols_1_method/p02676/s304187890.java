import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        if(str.length() <= k) System.out.println(str);
        else {
            String str1 = str.substring(0, k);
            System.out.println(str1 + "...");
        }
    }
}