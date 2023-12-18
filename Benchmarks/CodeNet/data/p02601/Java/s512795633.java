import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 1; i < K + 1; i ++){
            int n = A|B|C;
            if(n == A){
                int m = 2 * i * n;
                a = m;
            }
            if(n == B){
                int m = 2 * i * n;
                b = m;
            }
            if(n == C){
                int m = 2 * i * n;
                c = m;
            }
        }
        if(b > a && c > a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
}
}