import java.util.*;
import java.util.Map;
import java.util.TreeMap;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            if(map.containsKey(B[i])){
                map.put(B[i], map.get(B[i]) + A[i]);
            }
            else{
                map.put(B[i], A[i]);
            }
        }
        int sum = 0;
        for(int key : map.keySet()){
            sum += map.get(key);
            if(sum>key){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}