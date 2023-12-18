import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 10;
        int c = a / 100;
        if(b == c) System.out.println("Yes");
        else System.out.println("No");
    }
}