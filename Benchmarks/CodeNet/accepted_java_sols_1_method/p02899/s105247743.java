import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            map.put(A[i], i+1);
        }
        sc.close();

        for(Integer key: map.keySet()){
            System.out.print(map.get(key) + " ");
        }
        
    }
}