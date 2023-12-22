import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble(), h = sc.nextDouble(), x = sc.nextDouble(), y = sc.nextDouble();
        System.out.print(w * h / 2);
        if(w / 2 == x && h / 2 == y) System.out.println(" " + 1);
        else System.out.print(" " + 0);
    }
}