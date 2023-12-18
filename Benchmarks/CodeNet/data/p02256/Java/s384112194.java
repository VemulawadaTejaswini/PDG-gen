import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(gcd(M,N));
    }   

    public static int gcd(int M,int N){
        int x = M > N ? M : N;
        int y = M > N ? N : M;
        if (y == 1) return 1;
        if(x % y == 0){
            return y;
        }else{
            return gcd(y,x % y);
        }
    }
}
