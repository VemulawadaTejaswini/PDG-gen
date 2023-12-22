import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        
        int A[] = new int[N];
        for(int i = 0; i < N; ++i){
            A[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0; i < N; ++i){
            total += A[i];
        }
        if(total >= H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}