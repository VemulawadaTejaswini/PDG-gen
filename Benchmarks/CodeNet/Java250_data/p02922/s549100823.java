import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble()-1;
        double b = sc.nextDouble()-1;
        int ans = (int) Math.ceil(b/a);
        System.out.println(ans);
    }

}