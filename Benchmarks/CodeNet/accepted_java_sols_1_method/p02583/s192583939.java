import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> list = new ArrayList<String>();
        int L[] = new int[N];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        
        int ways = 0;
        String si, sj, sk;
        
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j+1; k < N; k++){
                    if(L[i] + L[j] > L[k] && L[j] + L[k] > L[i] && L[k] + L[i] > L[j] && L[i] != L[j] && L[i] != L[k] && L[j] != L[k]){
                        si = String.valueOf(L[i]);
                        sj = String.valueOf(L[j]);
                        sk = String.valueOf(L[k]);
                        ways++;
                    }
                }
            }
        }
        
        
        System.out.println(ways);
    }
}
