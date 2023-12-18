import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int MAX = 100001;
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i=2; i<MAX; i++){
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    prime[i] = false;
                    break;
                }
            }
        }
        
        boolean[] likeNum = new boolean[MAX];
        Arrays.fill(likeNum, false);
        
        for(int i=1; i<MAX; i+=2){
            if(prime[i] && prime[(i+1)/2]){
                likeNum[i] = true;
            }
        }
        
        int[] likeNumRui = new int[MAX];
        int sum = 0;
        for(int i=0; i<MAX; i++){
            if(likeNum[i]){
                sum++;
            }
            likeNumRui[i] = sum;
        }
        
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = likeNumRui[r] - likeNumRui[l-1];
            
            System.out.println(ans);
        }
    }
}