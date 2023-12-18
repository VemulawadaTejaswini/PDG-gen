import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();
        long M = sc.nextLong();

        Map<Long,Integer> history = new HashMap<>();

        int newer, older;
        long a = X;
        long[] sum = new long[120000]; // sum[i] : sigma[0,i] a[i]
        for(int i=1;; i++){
            sum[i] = sum[i-1] + a;
            if(history.containsKey(a)){
                newer = i;
                older = history.get(a);
                //System.out.printf("%d : %d, %d\n", a, older, newer);
                break;
            }
            history.put(a, i);
            a = (a*a)%M;
        }

        if(newer >= N){
            System.out.println(sum[(int)N]);
            return;
        }
        long periodCount = (N-newer) / (newer-older);

        long periodSum = sum[newer] - sum[older];

        long restartPoint = newer + (newer-older) * periodCount;
        long s = sum[newer] + periodSum * periodCount;

        //System.err.printf("sum[1, %d] = %d\n", restartPoint, s);

        for(long n=restartPoint+1; n<=N; n++){
            a = (a*a) % M;
            s += a;    
        }

        System.out.println(s);
        
    }
}