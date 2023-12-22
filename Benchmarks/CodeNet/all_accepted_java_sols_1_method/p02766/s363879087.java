import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = N;
        int K = sc.nextInt();
        int ans = 0;
        if(n>=K){
            for(int i=1; i<n; i++){
                ans = i;
                if(N/K<K){
                    ans = i + 1;
                    break;
                }
                N = (int)N / K;
            }
        
            System.out.println(ans);
        }
        else if(n<K){
            System.out.println(1);
        }
    }
}