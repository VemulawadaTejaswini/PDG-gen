import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int[N];
        long Num [] = new long[N+1];
        long Comb[][] = new long[N+1][2];
        long sum = 0;
        Arrays.fill(Num,0);
        for(int i=0;i<N+1;i++)Arrays.fill(Comb[i],0);
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            Num[A[i]]++;
        }
        for(int i=1;i<=N;i++){
            if(Num[i]!=0) {
                Comb[i][0] = (Num[i] * (Num[i] - 1)) / 2;
                Comb[i][1] = ((Num[i] - 1) * (Num[i] - 2)) / 2;
                sum += Comb[i][0];
            }
        }
        for(int i=0;i<N;i++) {
            long opt = sum-Comb[A[i]][0]+Comb[A[i]][1];
            System.out.println(opt);
        }
    }
}