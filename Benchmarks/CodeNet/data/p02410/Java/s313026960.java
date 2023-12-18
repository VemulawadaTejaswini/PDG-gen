import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a;
        int b;
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        for(int i = 0;i <= n * m - 1;i++){
            a = scan.nextInt();
            A.add(a);
        }
        for(int i = 0;i <= m - 1;i++){
            b = scan.nextInt();
            B.add(b);
        }
        for(int i = 0;i <= n - 1;i++){
            cOut(i,m,A,B);
        }
    }

    
    //行列cの生成・出力
    public static void cOut(int x,int m,ArrayList<Integer> A,ArrayList<Integer> B){
        int a;
        int b;
        int cSum = 0;
        for(int i = 0;i <= m - 1;i++){
            a = A.get(i + m * x);
            b = B.get(i);
            cSum += a * b;
        }
        System.out.println(cSum);
    }
}
