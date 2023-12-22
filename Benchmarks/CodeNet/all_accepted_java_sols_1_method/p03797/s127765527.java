
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner Input = new Scanner(System.in);
        long N = Input.nextLong();
        long M = Input.nextLong();       
        long X = Math.min(N, M/2);
        long Ans=0;Ans+=X;
        M-=X*2;
        Ans+=M/4;
        System.out.println(Ans);
    }
}
