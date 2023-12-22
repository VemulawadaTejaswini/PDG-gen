import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        System.out.print("2018/");
        for (int i = 5; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}
