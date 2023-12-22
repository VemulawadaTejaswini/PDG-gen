import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        if(a * n >= b){
            System.out.println(b);
        }else{
            System.out.println(a * n);
        }
    }
}