import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        for(int i=0;i<N;i++){
            H[i] = sc.nextInt();
        }
        for(int i=0;i<M;i++){
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            mp.putIfAbsent(A, new ArrayList<>());
            mp.putIfAbsent(B, new ArrayList<>());
            mp.get(A).add(B);
            mp.get(B).add(A);
        }
        int cnt=0;
        for(int i=0;i<N;i++){
            if(!mp.containsKey(i)){
                cnt++;
                continue;
            }
            boolean hasTaller = false;
            for(Integer nei:mp.get(i)){
                if(H[nei] >= H[i]){
                    hasTaller = true;
                }
            }
            if(!hasTaller){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
