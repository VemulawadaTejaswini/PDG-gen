import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='A'||c=='C'||c=='G'||c=='T'){
                cnt++;
            }else{
                ans = Math.max(ans,cnt);
                cnt = 0;
            }
        }
        ans = Math.max(ans,cnt);
        System.out.println(ans);
    }
}
