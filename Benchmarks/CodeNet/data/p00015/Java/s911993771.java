import java.util.*;
import java.math.BigInteger;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = Integer.parseInt(sc.next());
        for(int i=0;i<N;i++){
            run();
        }
        
    }
    
    static void run(){
        String strA = sc.next();
        BigInteger A = new BigInteger(strA);
        String strB = sc.next();
        BigInteger B = new BigInteger(strB);
        String o = "overflow";
        if(A.add(B).toString().length()>80){
            System.out.println(o);
        }else{
            System.out.println(A.add(B));
        }
        
    }
}