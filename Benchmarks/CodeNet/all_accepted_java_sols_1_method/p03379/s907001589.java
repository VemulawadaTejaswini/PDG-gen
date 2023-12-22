import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] X = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            X[i] = sc.nextInt();
            map.put(i, X[i]);
        }
        sc.close();
        Arrays.sort(X);

        for(int i = 0; i < N; i++){
            if(map.get(i) <= X[N/2-1]){
                System.out.println(X[N/2]);
            } else {
                System.out.println(X[N/2-1]);
            }
        }
        
    }
}