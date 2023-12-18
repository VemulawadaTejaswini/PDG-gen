import java.util.*;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        String S = scanner.next();
        String[] s = S.split("");
        
        String T = scanner.next();
        String[] t = T.split("");
        
        String ans = "";
        
        for(int i=0; i<N; i++){
            
            ans = ans + s[i] + t[i];
            
        }
        
        System.out.println(ans);
        
    }
}
