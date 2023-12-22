import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if(a >= k){
            print(a-k,b);
        }else if(a+b >= k){
            print(0,b-(k-a));
        }else{
            print(0,0);
        }
    }
    public static void print(long a, long b){
        System.out.println(a+" "+b);
    }
}