import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long x=sc.nextLong();
        long ans=2*(x/11);
        long tmp=x%11;
        if(tmp>0){
            if(tmp<=6){
            ans++;
            }else{
                ans+=2;
            }
        }
        out.println(ans);
    }
}