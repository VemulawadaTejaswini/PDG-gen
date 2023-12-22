import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Set<String> gacha = new HashSet<String>();
        
        for(int i=0;i<N;i++){
            gacha.add(sc.next());
        }
        
        System.out.println(gacha.size());
        
    }
}
