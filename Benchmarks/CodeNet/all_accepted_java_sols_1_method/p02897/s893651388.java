import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int a;
        double b;
        
        if(n % 2 == 0){
            a = n / 2;
            b = (double) a / n;
            System.out.println(b);
        }else{
            a = n / 2 + 1;
            b = (double) a / n;
            System.out.println(b);
        }
    }
}