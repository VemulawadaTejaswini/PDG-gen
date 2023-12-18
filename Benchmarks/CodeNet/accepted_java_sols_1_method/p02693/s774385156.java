import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                result = 1;
            }
        }
        if (result == 1) {
            System.out.println("OK");
        } else {
            System.out.println("NG");   
        }
    }
}