import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n,ans=0;
        
        n = sc.nextInt();
        
        Set<String> set = new HashSet<String>();
        
        for(int i = 0; i < n; i++){
            
            String prize;
            prize = sc.next();
            
            set.add(prize);
        }
        
        System.out.println(set.size());
    }
}
