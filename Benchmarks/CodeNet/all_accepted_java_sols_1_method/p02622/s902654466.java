import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.next();
        String T = scanner.next();
        int count = 0;
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)!=T.charAt(i)){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
