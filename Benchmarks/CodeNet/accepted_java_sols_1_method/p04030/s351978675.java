import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = new char[str.length()];
        s = str.toCharArray();    

        StringBuilder ans = new StringBuilder("");

        for(int i = 0 ; i < str.length() ; i ++){
            if (s[i] == '0' || s[i] == '1') {
                ans.append(s[i]);
//                System.out.println(s[i]);
//                System.out.println(ans);
            }

            else if(ans.length() != 0){
                ans.setLength(ans.length()-1);
            }
        }

        System.out.println(ans);
    }
}