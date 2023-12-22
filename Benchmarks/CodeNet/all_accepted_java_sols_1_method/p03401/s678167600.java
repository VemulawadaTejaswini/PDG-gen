import java.util.*;
public class Main {
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        int N,sum_price=0;
        N = sc.nextInt();
        int [] A = new int[N+2];
        int [] price = new int[N];
        for(int a=0;a<N+2;a++){
            if(a==0) A[a] =0;
            else if(a==N+1) A[a] =0;
            else A[a] = sc.nextInt();
        }
        for(int a=0;a<N+1;a++){
            sum_price+= Math.abs(A[a]-A[a+1]);
        }

        for(int a=0;a<N;a++){
            price[a] = sum_price - Math.abs(A[a]-A[a+1]) -Math.abs(A[a+1]-A[a+2])+Math.abs(A[a]-A[a+2]);
        }
        for(int a=0;a<N;a++){
            System.out.println(price[a]);
        }
    }
}
