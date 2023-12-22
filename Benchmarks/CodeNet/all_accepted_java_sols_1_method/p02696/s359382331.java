import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        if(N<B){
            System.out.println(Math.floorDiv(A*N,B));
        }else{
            System.out.println(Math.floorDiv(A*(B-1), B));
        }
    }

}
