import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String strN = sc.next();
        int N = Integer.parseInt(strN);
        System.out.println( N % S(strN) == 0 ? "Yes" : "No" );
        
    }
    
    static int S(String n){
        int ret = 0;
        for(int i = 0; i < n.length(); i++){
            ret += n.charAt(i) - '0';
        }

        int N = Integer.parseInt(n);
        
        return ret;
    }
}
