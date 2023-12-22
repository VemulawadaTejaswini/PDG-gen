import java.util.*;
 class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();
        boolean flag = stringMatching(S, T);
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean stringMatching(String S, String T){
        if(S.length() == T.length() || T.length() - S.length() > 1 || T.length() < S.length()){
            return false;
        }
        int i = 0;
        int j = 0;
        while(i < S.length()){
            if(S.charAt(i) != T.charAt(i)){
                return false;
            }
            i++;
            j++;
        }

        if(i == S.length() && j != T.length()){
            return true;
        }else{
            return false;
        }
    }
}
