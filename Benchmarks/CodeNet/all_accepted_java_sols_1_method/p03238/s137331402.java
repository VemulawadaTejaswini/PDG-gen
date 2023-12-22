import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(1 == N)
            System.out.println("Hello World");
        else {
            int A, B;
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}