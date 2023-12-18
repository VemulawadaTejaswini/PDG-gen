import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ans = 0;

        for (int i = 0; i<s.length();i++){
            ans += Character.getNumericValue(s.charAt(i));
        }

        if (ans % 9 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
