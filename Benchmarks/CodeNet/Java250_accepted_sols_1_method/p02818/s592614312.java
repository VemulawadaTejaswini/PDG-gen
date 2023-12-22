import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
 
        long t = A;
        long a = B;
 
        if((A+B)<=K){
            t=0;
            a=0;
        }else if(A > K){
            t -= K;
        }else{
            t=0;
            a -= (K-A);
        }
 
        System.out.println(t);
        System.out.println(a);
    }
}