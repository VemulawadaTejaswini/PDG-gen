import java.util.*;
import java.util.TreeMap;
import java.util.Map;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] A = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + 1);
            }
            else{
                map.put(A[i], 1);
            }
        }
        long sum = 0;
        for(int i : map.keySet()){
            sum += (long)map.get(i) * (map.get(i) - 1) / 2;
        }

        for(int i=0; i<N; i++){
            long a = sum;
            a -= (long)map.get(A[i]) * (map.get(A[i]) - 1) / 2;
            a += (long)(map.get(A[i]) - 1) * (map.get(A[i]) - 2) / 2;
            System.out.println(a);
        }
    }
}