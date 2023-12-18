import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int r = in.nextInt();
        int s = in.nextInt();
        int p = in.nextInt();
        
        char[] arr = in.next().toCharArray();
        char[] last = new char[k];
        for (int i = 0; i < k ;++i) {
            last[i] = 'x';
        }

        long ans = 0;
        for (int i = 0; i < n; ++i) {
            if (last[i % k] == 'x') {
                if (arr[i] == 'r') { ans += p; last[i % k] = 'p';}
                else if (arr[i] == 'p') { ans += s; last[i % k] = 's';}
                else if (arr[i] == 's') { ans += r; last[i % k] = 'r';}
            } else {
                if (arr[i] == 'r') {
                    if (last[i % k] != 'p') {
                        ans += p;
                        last[i % k] = 'p';
                    } else {
                        last[i % k] = 'x';
                    }
                } else if (arr[i] == 'p') {
                   if (last[i % k] != 's') {
                        ans += s;
                        last[i % k] = 's';
                    } else {
                        last[i % k] = 'x';
                    }
                } else {
                    if (last[i % k] != 'r') {
                        ans += r;
                        last[i % k] = 'r';
                    } else {
                        last[i % k] = 'x';
                    }
                }
            }
        }

        System.out.println(ans);
    }

}