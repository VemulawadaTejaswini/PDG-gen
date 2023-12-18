import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    int m, n;
    String[] remark;
    boolean[] users;
    int cur_user;
    int user_count;
    boolean init() {
        m = sc.nextInt();
        n = sc.nextInt();
        if (m == 0 && n == 0) return false;
        remark = new String[n];
        for (int i = 0; i < n; i++) {
            remark[i] = sc.next();
        }
        cur_user = 0;
        user_count = m;
        users = new boolean[m];
        for (int i = 0; i < m; i++) users[i] = true;
        return true;
    }
    void pass() {
        for (int i = cur_user+1; ; i++) {
            if (i == m) i -= m;
            if (users[i]) {
                cur_user = i;
                break;
            }
        }
    }
    void drop() {
        users[cur_user] = false;
        user_count--;
        pass();
    }
    String fizzbuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 5  == 0) return "Buzz";
        if (n % 3  == 0) return "Fizz";
        return String.valueOf(n);
    }
    boolean correct(int i, String s) {
        return s.equals(fizzbuzz(i));
    }
    void print_exist() {
        boolean start = true;
        for (int i = 0; i < m; i++) {
            if (users[i]) {
                if (!start) 
                    System.out.print(" ");
                System.out.print(i+1);
                if (start) start = false;
            }
        }
        System.out.println("");
    }
    void run() {
        while (init()) {
            for (int i = 1; i <= n; i++) {
                if (correct(i, remark[i-1]))
                    pass(); 
                else 
                    drop();
                if (user_count == 1) break;
            }
            print_exist();
       }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}