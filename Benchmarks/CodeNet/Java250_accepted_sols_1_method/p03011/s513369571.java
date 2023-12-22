import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();//A to B
        int Q = sc.nextInt();//B to C
        int R = sc.nextInt();//C to A

        int PQ = P+Q;
        int QR = Q+R;
        int RP = R+P;

        int m1 = Math.min(PQ,QR);
        int m2 = Math.min(QR,RP);
        int m3 = Math.min(m1,m2);

        System.out.println(m3);
        

    }
}
