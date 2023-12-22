import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        /*Random on=new Random();*/
        long a=in.nextLong();
        long b=in.nextLong();
        long k=in.nextLong();
        long ans_a=Math.max(0,a-k);
        k=Math.max(0,k-a);
        long ans_b=Math.max(0,b-k);
        System.out.println(ans_a + " "+ ans_b);
    }
}
