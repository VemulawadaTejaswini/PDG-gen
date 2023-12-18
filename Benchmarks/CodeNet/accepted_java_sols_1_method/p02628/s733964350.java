import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        int sum = 0;
        
        for(int i=0;i<K;i++){
            sum += list.get(i);
        }
        
        System.out.println(sum);
    }
}
