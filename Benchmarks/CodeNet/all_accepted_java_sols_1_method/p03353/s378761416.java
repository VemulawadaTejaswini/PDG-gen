import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int n=s.length();
        int k=sc.nextInt();
        HashSet<String> set=new HashSet<>();
        for (int i = 1; i <=k; i++) {
            for (int j =1; j <= n+1-i; j++) {
                set.add(s.substring(j-1, i+j-1));
            }
        }
        String[] sub=new String[set.size()];
        set.clear();
        int c=0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                int q1=set.size();
                set.add(s.substring(j-1, i+j-1));
                int q2=set.size();
                if(q1!=q2){
                    sub[c]=s.substring(j-1, i+j-1);
                    c++;
                }
            }
        }
        Arrays.sort(sub);
        out.println(sub[k-1]);
    }
}