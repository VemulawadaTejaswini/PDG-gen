import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ans=0;
        if(a>b){
            ans=0;
        }else if(a==b){
            ans=1;
        }else{
            if(n==1){
                ans=0;
            }else{
                ans=(n-2)*(b-a)+1;
            }
        }
        out.println(ans);
    }
}