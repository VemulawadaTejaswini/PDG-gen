import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        int a = 1;
        int b = 1;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<N; i++){
            a*=3;
            if(A[i]%2 ==0) b*=2;
        }
        
        System.out.println(a-b);
        
    }
}
