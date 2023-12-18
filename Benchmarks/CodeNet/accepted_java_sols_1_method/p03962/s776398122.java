import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ans = 0;
        if(a == b && b == c) {
            ans = 1;
        } else if(a != b && b != c && a != c) {
            ans = 3;
        } else {
            ans = 2;
        }
        System.out.print(ans);
    }
}