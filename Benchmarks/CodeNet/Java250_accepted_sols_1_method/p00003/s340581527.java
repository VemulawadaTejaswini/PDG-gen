import java.util.*;
import java.util.Scanner ; 
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int t,n1,n2,n3;
        int [] a = new int[3];
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0){
            t--;
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
            a[0] = n1 ; a[1] = n2 ; a[2]=n3;
            Arrays.sort(a);
            System.out.println((a[2]*a[2]==a[0]*a[0]+a[1]*a[1])? "YES" : "NO" );
        }
    }
}