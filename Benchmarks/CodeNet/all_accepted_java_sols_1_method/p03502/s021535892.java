
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        BigInteger BI = new BigInteger(S);
        long Sum = 0;

        for (int I = 0; I < S.length(); I++) {
            Sum += Integer.parseInt(S.charAt(I) + "");
        }

        BigInteger BX = new BigInteger(Sum + "");

        BigInteger X = new BigInteger(BI.mod(BX) + "");
        BigInteger CC = new BigInteger("0");

        if (X.equals(CC)) {
            System.out.println("Yes");
        }else{System.out.println("No");}
    }

}
