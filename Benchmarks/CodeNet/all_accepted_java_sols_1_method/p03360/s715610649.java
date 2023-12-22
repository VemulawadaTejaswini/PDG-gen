import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        int k = sc.nextInt();
        long f = Math.max(Math.max(a,b),c);
        if(a == f){
            System.out.println((int)(b + c + a * Math.pow(2,k)));
        }
        else if(b == f){
            System.out.println((int)(a + c + b * Math.pow(2,k)));
        }
        else System.out.println((int)(b + a + c * Math.pow(2,k)));

    }


}