import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
    
        List<Integer> h = new ArrayList<>();
        
        for (int i=0; i<N; i++) {
            h.add(sc.nextInt());
        }
        
        int count = 0;
        for (int j=0; j<N; j++) {
            if (h.get(j) >= K) {
                count++;
            }
        }
        
        System.out.println(count);
    }

}