import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int ans = (int)M/N;
        
        while( M % ans != 0 ){
            ans--;
        }
        
        System.out.println(ans);
        
    }
}
