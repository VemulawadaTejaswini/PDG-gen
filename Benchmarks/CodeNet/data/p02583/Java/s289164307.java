import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] L = new long[N];

        for(int i=0;i<N;i++){
            L[i] = sc.nextLong();
        }
        Arrays.sort(L);

        int ans =0;
        for(int i=0;i<N-2;i++){

            for(int j=i+1;j<N-1;j++){
                for(int k = j+1;k<N;k++){
                    if(L[i] + L[j] > L[k]){
                        if(L[i] != L[j] && L[j] != L[k] && L[j] != L[k]){
                            ans++;

                        }

                    }
                }
            }
        }
        System.out.println(ans);

    }

}


