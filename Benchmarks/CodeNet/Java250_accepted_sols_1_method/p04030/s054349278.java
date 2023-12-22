import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        String ans = "";

        for(int i=0; i<l; i++){
            if(s.charAt(i)!='B'){
                ans += "" + s.charAt(i);
            }
            else if(s.charAt(i)=='B' && ans.length()>0){
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        System.out.println(ans);
    }
}