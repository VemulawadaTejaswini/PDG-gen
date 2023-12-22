import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[2][N];
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++){
            A[0][i] = sc.nextInt();
            A[1][i] = sc.nextInt();
            if(map.containsKey(A[1][i]))
                map.put(A[1][i], map.get(A[1][i])+A[0][i]);
            else
                map.put(A[1][i], A[0][i]);
        }
        sc.close();

        int time = 0;
        for(Integer key: map.keySet()){
           if(time + map.get(key) <= key){
               time += map.get(key);
           } else {
               System.out.println("No");
               return;
           }
        }
        System.out.println("Yes");
    }
}