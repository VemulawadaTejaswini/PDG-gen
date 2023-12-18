import java.util.*;
import java.math.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static BigInteger a = new BigInteger("0");
    static BigInteger b = new BigInteger("0");
    static int n;

    public static void main(String[] args) {
        while(sc.hasNext()){
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                read();
                slove();
            }
        }
    }
    static boolean read(){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
        return true;
    }
    static void slove(){

        if(a.add(b).toString().length() >= 80 || a.toString().length() >= 80
                || b.toString().length() >= 80){
            System.out.println("overflow");
        }else{
            System.out.println(a.add(b));
        }

    }

}