import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = 0;
        for (int i = 0; i < n.length(); i++) {
            a += n.charAt(i) - '0';
        }
        if(Integer.valueOf(n) % a == 0) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

}