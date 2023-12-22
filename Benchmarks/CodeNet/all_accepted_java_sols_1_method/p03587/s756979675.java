import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String S = sc.next();
        for(int i=0;i<6;i++){
            ans += S.charAt(i)-'0';
        }
        System.out.println(ans);
    }
}