import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long A=sc.nextLong();
        long B=sc.nextLong();
        
        long PAIR=N/(A+B);
        long mod=N-PAIR*(A+B);
        
        long ANS=PAIR*A;
        
        if(mod<A){
            ANS+=mod;
        }else{
            ANS+=A;
        }
        
        System.out.println(ANS);
    }
}
