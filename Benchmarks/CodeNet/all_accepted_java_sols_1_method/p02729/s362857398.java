import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int even = sc.nextInt();
        int odd = sc.nextInt();
        int ans = even*(even-1)/2 + odd*(odd-1)/2;
        System.out.println(ans);
    }

}