import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int l=s.length();
        int ans=0;
        for (int i = 1; i < l; i++) {
            if(s.charAt(i)!=s.charAt(i-1))ans++;
        }
        out.println(ans);
    }
}