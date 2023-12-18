import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] cl = sc.next().toCharArray();
        String ans = "";
        for(char c : cl){
            if(c == '0'){
                ans += "0";
            }else if(c == '1'){
                ans += "1";
            }else{
                if(ans.length() != 0){
                    ans = ans.substring(0,ans.length()-1);
                }
            }
        }
        System.out.println(ans);
    }
}
