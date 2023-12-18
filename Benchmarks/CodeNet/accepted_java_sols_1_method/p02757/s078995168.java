import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] keta = new int[N];
        for(int i=0;i<N;i++){
            keta[i] = s[i]-'0';
        }

        long sum=0;
        if(P == 2 || P == 5){
            for(int i=0;i<N;i++){
                if(keta[i] % P == 0){
                    sum += (i+1);
                }
            }
            System.out.println(sum);
            return;
        }
        int[] S = new int[N];
        for(int i=0;i<N;i++){
            S[i] = keta[N-1-i];
        }
        int[] A = new int[N+1];
        int m10 = 1;
        A[0]=0;
        Map<Integer, Integer> cnts = new HashMap<>();
        cnts.put(0, 1);
        for(int k=0;k<N;k++) {
            A[k + 1] = (S[k] % P) * m10 + A[k];
            A[k + 1] %= P;
            m10 *= 10;
            m10 %= P;
            cnts.computeIfAbsent(A[k+1], (i)->0);
            cnts.put(A[k+1], cnts.get(A[k+1])+1);
        }
        for(Integer p:cnts.values()){
            long cn = (long)p;
            sum += cn*(cn-1)/2;
        }
        System.out.println(sum);
    }
}
