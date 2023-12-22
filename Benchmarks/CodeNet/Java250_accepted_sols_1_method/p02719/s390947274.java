import java.util.*;
import java.lang.Math;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long N = sc.nextLong();
        long K = sc.nextLong();
        long t = N/K;
        long temp1=Math.abs(N-K*t);
        long temp2=Math.abs(temp1-K);
        System.out.println((temp1<=temp2) ? temp1 : temp2);
    }
}