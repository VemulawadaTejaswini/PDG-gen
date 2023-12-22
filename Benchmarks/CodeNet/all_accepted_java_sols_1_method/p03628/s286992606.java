import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        long ans;
        boolean pat;
        if(s.length() == 1){
            System.out.println(3);
            return;
        }
        if(s.charAt(0) == s.charAt(1)){
            ans = 6;
            pat = false;
        }else{
            ans = 3;
            pat = true;
        }

        for(int i = pat ? 1 : 2; i < s.length(); i++){
            if(i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                if(pat){
                    ans *= 2;
                }else{
                    ans *= 3;
                }
                pat = false;
                i++;
            }else{
                if(pat){
                    ans *= 2;
                }
                pat = true;
            }
        }

        System.out.println(ans % 1000000007);

    }
}
