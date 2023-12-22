import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> words = new HashSet<>();
        
        boolean isOK = true;
        char last = '0';
        for(int i = 0; i < N; i++){
            String W = sc.next();
            
            if(words.contains(W)){
                isOK = false;
                break;
            }
            
            words.add(W);
            
            if( i > 0 && last != W.charAt(0) ){
                isOK = false;
                break;
            }
            
            last = W.charAt(W.length()-1);
        }

        System.out.println( isOK ? "Yes" : "No" );
    }
}
