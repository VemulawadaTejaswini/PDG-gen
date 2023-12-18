import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        long n = scan.nextLong();    // s
        long m = scan.nextLong();   // c
        
        // output
        if(m < 2){
            System.out.println(0);
        } else if(m < n * 2){
            System.out.println(Math.min(m / 2, n));
        } else {
            System.out.println(n + (m - n * 2) / 4);
        }
    }
}