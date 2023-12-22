import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        long maxd=1L;
        int kurai=0;
        while(true){
            if(maxd-1L < N){        //2進数だったら15より大きい17は5桁
                maxd*=K;
                kurai++;
            }
            else {
                break;
            }
        }
        pl(kurai);
    }
    public static void pl(Object o){
        System.out.println(o);
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
