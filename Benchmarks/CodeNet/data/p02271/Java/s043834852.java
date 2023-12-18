import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //数列Aの長さ
        int[] A = new int[n]; //数列A
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt(); //整数mの数
        for (int i=0; i<q; i++) {
            int m = sc.nextInt(); //整数m
            if(check(n,m,A)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }            
        }
    }
    static boolean check(int n, int m, int[] A) {
        if(m==0) return true;
        else if(n==0) return false;
        else if(check(n-1,m,A)) return true;
        else if(check(n-1,m-A[n-1],A)) return true;
        else return false;
    }
}

