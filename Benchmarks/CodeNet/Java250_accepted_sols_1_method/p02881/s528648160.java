import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long tmp = N+1;
        long ans = 0;

        for(long i = 1; i < Math.sqrt(N)+1; i++){
            if(N % i == 0){
                ans = N / i;
                tmp = Math.min(tmp,ans+i);
            }
        }

        /*for(long i = 1; i < (N/2); i++){
            if(N % i == 0){
                ans2 = N / i;
                //ans2 = (int)ans;
                tmp = Math.min(tmp,ans2+i);
            }
        }*/

        System.out.println(tmp - 2);
    }
}