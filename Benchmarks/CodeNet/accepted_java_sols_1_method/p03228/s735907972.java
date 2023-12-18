import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        for(int i=1; i<=K; i++){
            if(i%2 == 1){
                if(A%2 == 1){
                    A--;
                }
                A = (A/2);
                B += A;
                continue;
            }else{
                if(B%2 == 1){
                    B--;
                }
                B = (B/2);
                A += B;
                continue;
            }
        }
        
        
        System.out.println(A+" "+B);
    }
}

