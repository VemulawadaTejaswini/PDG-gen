import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean ans = false;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '7')
                ans = true;
        }
        if (ans)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}