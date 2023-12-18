import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        int res = 0;
        if(K <= A){
            res += K;
        }else if (K <= A+B){
            res += A;
            res += 0;
        }else{
            res += A;
            res += 0;
            res -= (K - A - B);
        }
        System.out.println(res);
    }
}