import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        
        //String s = sc.next();
        
        int a = (int)Math.sqrt(n);
        long b=0;
        int M=0;
        while(M==0){
            if(n%a==0){
                b=n/a;
                M=get_digit(b);
            }
            a--;
        }
        System.out.println(M);
    }
    private static int get_digit(long num){
        if(num<10){
            return 1;
        }else if(num<100){
            return 2;
        }else if(num<1000){
            return 3;
        }else if(num<10000){
            return 4;
        }else if(num<100000){
            return 5;
        }else if(num<1000000){
            return 6;
        }else if(num<10000000){
            return 7;
        }else if(num<100000000){
            return 8;
        }else if(num<1000000000){
            return 9;
        }else{
            return 10;
        }
    }
}