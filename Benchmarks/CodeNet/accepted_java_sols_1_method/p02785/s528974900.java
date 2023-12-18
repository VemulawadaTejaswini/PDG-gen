import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> H = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            H.add(sc.nextInt());
        }
        Collections.sort(H, Comparator.comparingInt(a -> a));
        if(N < K){
            System.out.println(0);
        }else {
            long res = H.stream().limit(N - K).collect(Collectors.summingLong(Integer::longValue));
            System.out.println(res);
        }
    }
}
