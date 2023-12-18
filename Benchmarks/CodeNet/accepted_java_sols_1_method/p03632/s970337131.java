import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = Math.min(b,d) - Math.max(a,c);
        if(e >= 0) System.out.println(e);
        else System.out.println(0);
    }
}