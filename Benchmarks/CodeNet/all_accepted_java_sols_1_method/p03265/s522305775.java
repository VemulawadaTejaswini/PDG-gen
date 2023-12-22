import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print((x2+y1-y2) + " ");
        System.out.print((y2+x2-x1) + " ");
        System.out.print((x1+y1-y2) + " ");
        System.out.print((y1+x2-x1) + " ");
    }
}