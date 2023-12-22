
import java.lang.Math;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long blue = sc.nextLong();
        long red  = sc.nextLong();
        long l = n/(blue+red)*blue;
        long rem = n%(red+blue);
        l += Math.min(rem, blue);
        System.out.println(l);
    }
}