import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int k = sc.nextInt();
        int count = 0;
        while (b <= a) {
            b = b * 2;
            count++;
        }
        while (c <=b) {
            c = c * 2;
            count++;
        }
        if (!(count > k)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }   
    }
}
