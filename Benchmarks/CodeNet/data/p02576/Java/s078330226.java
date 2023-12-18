import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();

        int A;
        int B;
        int C;
      
        A=N/X;
        B=N%X;
        if(B==0){
        	C=A*T;
        } else {
        	C=(A+1)*T;
        }
      
      
        // 出力
        System.out.println(C);
    }
}