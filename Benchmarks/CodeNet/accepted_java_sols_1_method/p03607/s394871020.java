import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.remove(A[i]);
            }
            else{
                map.put(A[i], 0);
            }
        }

        System.out.println(map.size());
    }
}