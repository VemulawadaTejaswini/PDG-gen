import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long a = in.nextLong();
            long b = in.nextLong();
            System.out.println("" + gcd(a,b) + " " + lcm(a,b));
        }
    }
    static long gcd(long a, long b){
        return b!=0 ? gcd(b,a%b) : a;
    }
    static long lcm(long a, long b){
        return a/gcd(a,b)*b;
    }
}