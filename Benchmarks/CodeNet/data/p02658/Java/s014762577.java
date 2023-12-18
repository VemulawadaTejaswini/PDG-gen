import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> kazu = new ArrayList<>();
        long ans = 1l;
        for(long i = 0l;i < N;i++){
            long temp = sc.nextLong();;
            ans *= temp;
        }
        long max = 1000000000000000000l;
        if(ans <= max){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}
