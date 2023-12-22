import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<N;i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        int tmp = Math.min(K,N);
        
        list.subList(0, tmp).clear();
        
        long cnt = 0;
        
        for(int i=0;i<list.size();i++){
            cnt += list.get(i);
        }
        
        System.out.println(cnt);
    }
}
