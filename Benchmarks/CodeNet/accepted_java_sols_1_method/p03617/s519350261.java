import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long Q = sc.nextLong();
        long H = sc.nextLong();
        long S = sc.nextLong();
        long D = sc.nextLong();
        long N = sc.nextLong();
        sc.close();
        
        long min = Math.min(Math.min(4*Q, 2*H), S);

        if(2*min <= D){
            System.out.println(min*N);
        } else {
            System.out.println(D*(N/2) + min*(N%2));
        }

    }
}