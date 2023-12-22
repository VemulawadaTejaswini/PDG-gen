import java.util.Scanner;

/**
 * ABC111B
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        
        long sum = N*L + N*(N-1)/2;
        
        long min = 100000000000L;
        
        long ans =0;
        
        for(int i=1;i<=N;i++) {
        	long sum_tmp = sum - (L+i-1);
        	if(Math.abs(sum_tmp-sum)<Math.abs(ans-sum)) {
        		ans = sum_tmp;
        	}
        }
        
//        System.out.println(sum);
        
        System.out.println(ans);


        sc.close();
    }
}