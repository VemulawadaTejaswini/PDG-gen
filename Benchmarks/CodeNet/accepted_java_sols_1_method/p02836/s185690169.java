import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        
        int ans = 0;
        for (int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            ans += arr[i] != arr[j] ? 1 : 0;
        }

        System.out.println(ans);
    }
}