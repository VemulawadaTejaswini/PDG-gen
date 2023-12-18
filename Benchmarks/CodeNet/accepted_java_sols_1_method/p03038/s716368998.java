import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[][] B = new int[2][M];
        long sum = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        for(int i = 0; i < M; i++){
            B[0][i] = sc.nextInt();
            B[1][i] = sc.nextInt();
            if(map.containsKey(B[1][i])){
                map.put(B[1][i], map.get(B[1][i])+B[0][i]);
            } else {
                map.put(B[1][i], B[0][i]);
            }
        }
        sc.close();

        Arrays.sort(A);
        int[][] C = new int[2][map.size()];
        int i = 0;
        for(Integer key: map.keySet()){
            C[0][i] = key;
            C[1][i] = map.get(key);
            i++;
        }

        int i_A = 0;
        int i_C = map.size()-1;
        while(i_A < N && i_C >= 0){
            if(A[i_A] < C[0][i_C] && C[1][i_C] > 0){
                sum += C[0][i_C] - A[i_A];
                C[1][i_C]--;
                if(C[1][i_C] == 0)
                    i_C--;
            }
            i_A++;
        }

        System.out.println(sum);
    }
}