import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] A = new int[2][N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
            map.put(A[0][i], A[1][i]);
        }
        sc.close();
        Arrays.sort(A[0]);

        System.out.println(A[0][N-1]-A[0][0]+1 + map.get(A[0][N-1])+A[0][0]-1);


   }
}