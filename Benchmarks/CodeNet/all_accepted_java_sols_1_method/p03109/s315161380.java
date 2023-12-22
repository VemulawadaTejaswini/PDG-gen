import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int A = 20190430;
        
        S = S.replace("/","");
        int num = Integer.parseInt(S); 
 
        System.out.println(num - A <= 0 ? "Heisei" : "TBD");
    }
}