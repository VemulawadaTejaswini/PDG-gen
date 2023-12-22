import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n = a.length();
        int ans = 0;

        for (int i = 0; i<n; i++){
            if (a.charAt(i) != b.charAt(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}