
import java.util.*;

public class Main {
    static int[][] graph;
    static int[] check;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = 1000000000;
        long x, y;
        if(n%b==0){
            y = n/b;
            x = 0;
        }
        else{
            y = n/b + 1;
            x = y*b-n;
        }
        System.out.println("0 0 1000000000 1 " + x + " " + y);
    }
}