import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        double a = (double) n / (d * 2 + 1);
        if(a % 1 != 0){
            System.out.println(n / (d * 2 + 1) + 1);
        }else{
            System.out.println(n / (d * 2 + 1));
        }
    }
}