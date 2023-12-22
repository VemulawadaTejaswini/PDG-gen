import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        int n=r.nextInt();
        int k=r.nextInt();
        ArrayList<Integer> p=new ArrayList<>();
        for(int i=0;i<n;++i){
            int x=r.nextInt();
            p.add(x);
        }
        Collections.sort(p);
        int ans=0;
        for(int i=0;i<k;++i) ans+=p.get(i);
        System.out.println(ans);
    }
}
