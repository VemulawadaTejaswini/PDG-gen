import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String result = "No";
        if(S.charAt(0) == S.charAt(1)){
            if(S.charAt(0) != S.charAt(2) && S.charAt(2) == S.charAt(3)){
                result = "Yes";
            }
        } else if(S.charAt(0) == S.charAt(2)){
            if(S.charAt(0) != S.charAt(1) && S.charAt(1) == S.charAt(3)){
                result = "Yes";
            }
        } else if(S.charAt(0) == S.charAt(3)){
            if(S.charAt(0) != S.charAt(1) && S.charAt(1) == S.charAt(2)){
                result = "Yes";
            }
        }
        System.out.println(result);
    }
}
