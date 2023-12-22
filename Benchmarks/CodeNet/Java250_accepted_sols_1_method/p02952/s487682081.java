import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int out = 0;
        if(n < 100){
            if(n > 9){
                out = 9;
            }else{
                out = n;
            }
        }else if(n < 10000){
            if(n < 1000){
                out = n - 90;
            }else{
                out = 909;
            }
        }else if(n < 100000){
            out = n - 9090;
        }else{
            out = 90909;
        }
        System.out.println(out);
    }
}