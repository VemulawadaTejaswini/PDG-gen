import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for(int i=1; i<n-1; i++){
            int cnt = 0;
            for(char c = 'a'; c<='z'; c++){
                if(s.substring(0,i).contains(String.valueOf(c)) && s.substring(i).contains(String.valueOf(c))){
                    cnt++;
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
}
