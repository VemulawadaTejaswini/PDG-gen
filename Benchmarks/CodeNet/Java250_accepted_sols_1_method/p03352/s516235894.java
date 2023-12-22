import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = 0;
    int ans = 0;
    
    if(N<4){
        ans = 1;
    }else{
    for(int i=2; i<=N; i++){
        M = 0;
        for(int j=2; M<=N; j++){
                        if(ans < M){
                ans = M;
            }
            M = (int)Math.pow(i,j);

        }
    }  
    }
    System.out.println(ans);
    }
}