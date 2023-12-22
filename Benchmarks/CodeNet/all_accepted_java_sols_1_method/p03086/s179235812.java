import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        char[] ACGT = {'A','C','G','T'};
        for(int i=0;i<str.length;i++){
            for(Character d:ACGT){
                if(str[i]==d){
                    str[i]='A';
                    break;
                }
            }
        }

        int ans = 0;
        int now = 0;
        for(Character c:str){
            if(c=='A'){
                now++;
                ans = Math.max(ans,now);
            }
            else{
                ans = Math.max(ans,now);
                now = 0;
            }
        }
        System.out.println(ans);
    }
}
