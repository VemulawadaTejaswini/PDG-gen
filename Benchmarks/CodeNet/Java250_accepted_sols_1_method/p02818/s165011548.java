import java.util.*;

class Main{
    //149b
    static final int DIV = 100000007;
    static final int MAX = 2000000000;
    static long[] num = new long[20];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        a -= c;
        if(a >= 0){
            System.out.println(a + " " + b);
            return;
        }else{
            b += a;
            if(b < 0)b = 0;
            System.out.println("0 " + b);
        }
    }
    
}