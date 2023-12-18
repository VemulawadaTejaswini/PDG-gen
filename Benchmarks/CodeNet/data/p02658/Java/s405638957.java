import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> kazu = new ArrayList<>();
        
        long ans = 1;
        long max = 1000000000000000000l;
        for(int i = 0;i < N;i++){
            long temp = sc.nextLong();;
            kazu.add(temp);
        }
        for(int i = 0;i < N;i++){
            long temp2 = kazu.get(i);
            ans *= temp2;
            if(ans >= max){
            break;
            }
        }
        //System.out.println(kazu);
        if(kazu.contains(0l)){
            System.out.println(0);
        }
        else if(ans <= max){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
