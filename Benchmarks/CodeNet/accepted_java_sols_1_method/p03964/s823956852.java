import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for(int i=0;i<N;i++){
            BigInteger ta = new BigInteger(sc.next());
            BigInteger tb = new BigInteger(sc.next());
            if(a.compareTo(ta) != 1 && b.compareTo(tb) != 1){
                a = ta;
                b = tb;
            }else if(a.compareTo(ta) != -1 && b.compareTo(tb) != -1){
                BigInteger[] aa = a.divideAndRemainder(ta);
                BigInteger[] bb = b.divideAndRemainder(tb);
                if(!aa[1].equals(BigInteger.ZERO)){
                    aa[0] = aa[0].add(BigInteger.ONE);
                }
                if(!bb[1].equals(BigInteger.ZERO)){
                    bb[0] = bb[0].add(BigInteger.ONE);
                }
                BigInteger xa = aa[0].max(bb[0]);
                a = xa.multiply(ta);
                b = xa.multiply(tb);
            }else{
                if(a.compareTo(ta) != -1){
                    BigInteger[] aa = a.divideAndRemainder(ta);
                    if(!aa[1].equals(BigInteger.ZERO)){
                        aa[0] = aa[0].add(BigInteger.ONE);
                    }
                    a = aa[0].multiply(ta);
                    b = aa[0].multiply(tb);
                }else{
                    BigInteger[] bb = b.divideAndRemainder(tb);
                    if(!bb[1].equals(BigInteger.ZERO)){
                        bb[0] = bb[0].add(BigInteger.ONE);
                    }
                    a = bb[0].multiply(ta);
                    b = bb[0].multiply(tb);
                    
                }
            }
        }
        System.out.println(a.add(b));
    }
}
