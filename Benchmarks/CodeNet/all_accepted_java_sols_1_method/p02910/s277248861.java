import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();

        String ans = "Yes";

        for (int i = 1; i<=len; i++){
            if (i%2 == 0 && s.charAt(i-1) == 'R') {
                ans = "No";
                break;
            }
            else if (i%2 == 1 && s.charAt(i-1) == 'L'){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}