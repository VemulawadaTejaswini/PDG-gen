import java.util.*;
import java.io.*;
// import lib.util.*;
// import lib.graph.*;
// import lib.io.*;
// import lib.math.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int res = 0;
        for (int i = 0; i < 3; i++) {
            if (s[i] == 'R') {
                res++;
            }
        }
        if (s[1] != 'R' && res == 2) {
            System.out.println(1);
        } else {
            System.out.println(res);
        }
    }
}