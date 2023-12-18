import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long count = 0;

        for(long i=k; i<=n+1; i++){
            count = count + i*(n-i+1)+1;
        }
        System.out.print(count%1000000007);
    }
}