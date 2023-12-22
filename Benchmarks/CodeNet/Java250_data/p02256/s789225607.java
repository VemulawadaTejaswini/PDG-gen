import java.util.Scanner;
import java.util.Arrays;

public class Main{
    static int gcd(int a, int b){
        if(b < a){ int tmp = b; b = a; a = tmp; }
        while(a != 0){
            int tmp = b % a;
            b = a; a = tmp;
        }
        return b;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(gcd(a, b));
    }
}