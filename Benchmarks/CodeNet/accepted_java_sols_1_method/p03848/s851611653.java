import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(map.containsKey(A[i]))
                map.put(A[i], map.get(A[i])+1);
            else
                map.put(A[i], 1);
        }
        sc.close();

        long sum = 1;
        int mod = (int)Math.pow(10, 9)+7;
        for(Integer key: map.keySet()){
            if(N%2 == 1){
                if(key%2 == 1){
                    sum = 0;
                } else {
                    if(key == 0){
                        if(map.get(key) != 1)
                            sum = 0;
                    } else {
                        if(map.get(key) != 2)
                            sum = 0;
                        else
                            sum = (sum*2) % mod;
                    }
                }
            } else {
                if(key%2 == 0){
                    sum = 0;
                } else {
                    if(map.get(key) != 2)
                        sum = 0;
                    else
                        sum = (sum*2) % mod;
                }
            }
        }
        System.out.println(sum);
    }
}