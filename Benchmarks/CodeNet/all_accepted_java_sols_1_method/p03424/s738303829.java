import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Set<String> hina = new HashSet<>();
        for(int i = 0; i < N; i++) {
            hina.add(sc.next());
        }
        
        String ans = "Three";
        if( hina.size() == 4 ) {
            ans = "Four";
        }
        
        System.out.println(ans);
    }
}
