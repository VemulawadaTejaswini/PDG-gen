import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int K = sc.nextInt();
        if(2*K>=(B-A+1)){
            for(long i=A;i<=B;i++){
                System.out.println(i);
            }
        }
        else{
            for(long i=A;i<A+K;i++){
                System.out.println(i);
            }
            for(long i=B-K+1;i<=B;i++){
                System.out.println(i);
            }
        }
        //System.out.println(ans);
    }
}