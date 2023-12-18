import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] argv){
        Scanner s = new Scanner(System.in);
        BigInteger a = null,
                   b = null,
                   c = null,
                   max = null;
        String maxs = "";
        for(int i=0;i<80;i++){
            maxs += "9";
        }
        max = new BigInteger(maxs);
        int m = s.nextInt();
        for(int i=0;i < m;i++){
            a = s.nextBigInteger();
            b = s.nextBigInteger();
            c = a.add(b);
            System.out.println((c.compareTo(max) > 0 ? "overflow" : c ).toString());
        }
    }
}