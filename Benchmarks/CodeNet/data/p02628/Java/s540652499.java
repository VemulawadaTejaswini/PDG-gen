import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++){
            int s = scanner.nextInt();
            list.add(s);
        }
        
        Collections.sort(list);
        
        int sum = 0;
        
        for(int i=0; i<K; i++){
            sum += list.get(i);
        }
        
        System.out.println(sum);
    }
}
