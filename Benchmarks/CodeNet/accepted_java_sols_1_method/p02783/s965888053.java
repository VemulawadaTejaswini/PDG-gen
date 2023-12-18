import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println((H+A-1)/A);
    }
}
