import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        long n;
        n=r.nextLong();
        --n;
        ArrayList<Integer> a=new ArrayList<>();
        while(n>-1){
            int ch=(int)(n%26);
            a.add(ch);
            n/=26;
            --n;
        }
        Collections.reverse(a);
        for(int x:a){
            System.out.print((char)(x+'a'));
        }
    }
}
