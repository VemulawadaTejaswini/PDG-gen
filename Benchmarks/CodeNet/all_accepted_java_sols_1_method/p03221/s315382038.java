import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] Y = new int[2][M];
        
        for(int i = 0; i < M; i++){
            Y[0][i] = sc.nextInt();
            Y[1][i] = sc.nextInt();
        }
        sc.close();
        int[] index  = new int[M];
        for(int i = 0; i < M; i++)
            index[i] = i;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < M; i++){
            map.put(Y[1][i], index[i]);
        }
        Arrays.sort(Y[1]);
        int[] count = new int[N];
        for(int i = 0; i < N; i++)
            count[i] = 1;
        int[] countM = new int[M];
        for(int i = 0; i < M; i++){
            countM[map.get(Y[1][i])] = count[Y[0][map.get(Y[1][i])] -1];
            count[Y[0][map.get(Y[1][i])] -1]++;
        }
        for(int i = 0; i < M; i++){
            System.out.println(String.format("%06d%06d", Y[0][i], countM[i]));
        }
    }
}