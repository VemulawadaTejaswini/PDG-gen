import java.util.*;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        long[] A=new long[N];
        long allA=0;
        long Mod = (long)Math.pow(10,9)+7;
        for(int i=0; i<N; i++){
            A[i]=sc.nextLong();
            allA = (allA + A[i])%Mod;
        }
        long res=0;
        for(int i=0; i<N; i++){
            allA = allA - A[i];
            if(allA<0){
                allA = allA + Mod;
            }
            res = (res + A[i]*allA)%Mod;
        }

        System.out.println(res);
}

}