import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long X=Math.abs(sc.nextLong());
        long K=Math.abs(sc.nextLong());
        long D=Math.abs(sc.nextLong());
        long result=0;
        if(X/D-K>0){
            result=X-K*D;
        }else{
            if(K%2==1){
                X=Math.abs(X-D);
                K=K-1;
            }
            long K2=((long)(X/D/2))*2;
            result=Math.min(X-K2*D,Math.abs(X-(K2+2)*D));
        }


        System.out.println(result);

    }
}