import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        
        List<Integer> hs0 = new ArrayList<>();
        List<Integer> hs1 = new ArrayList<>();
        
        if( S.charAt(0) == '0' ) hs1.add(0);
        int count0 = 0;
        int count1 = 0;        
        for(int i = 0; i < N; i++){
            if( S.charAt(i) == '0' ){
                if(count1 > 0) hs1.add(count1);
                count1 = 0;
                count0++;
            }else{
                if(count0 > 0) hs0.add(count0);
                count0 = 0;
                count1++;
            }
            
            if( i == N -1 ){
                if(count0 > 0) hs0.add(count0);
                if(count1 > 0) hs1.add(count1);
            }
            
        }
        if( S.charAt(N-1) == '0' ) hs1.add(0);
        
        if( hs0.size() <= K ){
            System.out.println(N);
            return;
        }
        
        long maxSum = 0;
        for(int i = 0; i < K; i++){
            if(i == 0){
                maxSum += hs1.get(i) + hs0.get(i) + hs1.get(i+1);
            } else {
                maxSum += hs0.get(i) + hs1.get(i+1);
            }
        }
        
        long sum = maxSum;
        for(int i = 0; i < hs0.size()-K; i++){
            sum += hs0.get(K+i) + hs1.get(K+1+i);
            sum -= hs0.get(i) + hs1.get(i);
            maxSum = Math.max(maxSum, sum);
        }
        
        System.out.println(maxSum);
        
    }
}
