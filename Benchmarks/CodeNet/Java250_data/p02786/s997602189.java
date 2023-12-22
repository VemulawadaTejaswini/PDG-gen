import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();   
        int res = 0;
        for (int i = 0; i <= 50; i++) {
            if (h >= Math.pow(2, i) && h < Math.pow(2, i+1)) {
                res = i;
                break;
            }
        }
        long sum = 0;
        for (int i = 0; i <= res; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(sum);
    }
}