import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean[] prime = new boolean[123456*2];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        
        for(int i = 2; i<prime.length; i++){
            if(prime[i]){
                for(int h = 2; h<prime.length/2;h++){
                    for(int j = h*i; j<=prime.length; ){
                        prime[j] = false;
                    }
                }
            }
        }
        
        int[] count = new int[123456*2];
        count[0] = count[1] = 0;
        for(int i=2; i<count.length; i++){
            count[i] = count[i-1] + (prime[i] ? 1:0);
        }
        
        while(true){
            int N = sc.nextInt();
            if(N == 0) break;
            System.out.println(count[2*N] - count[N]);
        }
    }
}