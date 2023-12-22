import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a_list = new int[N+1];
        int[] confirmed = new int[N+1];
        for(int i = 1; i < N+1; i++){
            a_list[i] = sc.nextInt();
        }
        
        int numOfMultiples = 1;
        int cnt = 2;
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = N; i > 0; i--){
            if(i <= N/cnt){
                numOfMultiples ++;
                cnt ++;
            }
            
            if(numOfMultiples == 1){
                confirmed[i] = a_list[i];
            } else{
                int cnt2 = 2;
                int total = 0;
                while(i*cnt2 <= N){
                    total += confirmed[i*cnt2];
                    cnt2 ++;
                }
                confirmed[i] = total%2 == a_list[i] ? 0 : 1;
                total = 0;
            }
            if(confirmed[i] == 1){
                ans.add(i);
            }
        
        }
  
        System.out.println(ans.size());
        for(Integer i : ans){
            System.out.print(i + " ");
        }
    }
}
