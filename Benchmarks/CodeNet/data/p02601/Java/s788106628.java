import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {

    static int magic(int A, int B, int C){
        if(B>=C) return 1 + magic(A, B, 2*C);
        if(A>=B) return 1 + magic(A, 2*B, C) ;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(magic(A,B,C)<=K ? "Yes" : "No");
    }
}
