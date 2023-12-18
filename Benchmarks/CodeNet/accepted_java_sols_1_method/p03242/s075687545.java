import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String strN = sc.next();
        
        String ans = "";
        for(int i = 0; i < strN.length(); i++){
            if( strN.charAt(i) == '1' ){
                ans += "9";
            } else if( strN.charAt(i) == '9' ){
                ans += "1";
            } else {
                ans += strN.charAt(i);
            }       
        }
        
        System.out.println(ans);
        
    }
}
