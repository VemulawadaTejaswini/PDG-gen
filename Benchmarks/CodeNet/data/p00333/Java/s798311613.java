import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int a1 = a;
        int b1 = b;
        while (a1 != b1){
            if(a1 > b1)a1 -= b1;
            else b1 -= a1;
        }
        a /= a1;
        b /= a1;
        System.out.println(sc.nextInt() * a * b);
    }



}

