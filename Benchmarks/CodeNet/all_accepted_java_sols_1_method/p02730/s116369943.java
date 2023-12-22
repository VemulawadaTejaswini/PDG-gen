import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "No";
        String sr = "";
        for(int i = 0;i<s.length();i++){
            sr += s.substring(s.length()-i-1,s.length()-i);
        }
        if(s.equals(sr)){
            String s1 = "";
            String s1r = "";
            s1 = s.substring(0, (s.length()-1)/2);
            for(int i = 0 ;i<s1.length();i++){
                s1r += s1.substring(s1.length()-i-1, s1.length()-i);
            }
            if(s1.equals(s1r)){
                String s2 = "";
                String s2r = "";
                s2 = s.substring((s.length()+3)/2-1,s.length());
                for(int i = 0 ; i<s2.length();i++){
                    s2r += s2.substring(s2.length()-i-1,s2.length()-i);
                }
                if(s2.equals(s2r)){
                    ans = "Yes";
                }
            }
        }
        System.out.println(ans);
    }
}