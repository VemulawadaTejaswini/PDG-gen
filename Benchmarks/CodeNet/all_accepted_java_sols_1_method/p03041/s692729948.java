import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        String S = null;
        
        S = scanner.next();
        
        int count;
        String small = "";
        
        for(count=0 ; count < S.length() ; count++){
            if(count == K - 1){
                small += String.valueOf(S.charAt(count)).toLowerCase();
            }else{
                small += String.valueOf(S.charAt(count));
            }
        }
        
        System.out.println(small);
        
    }
}