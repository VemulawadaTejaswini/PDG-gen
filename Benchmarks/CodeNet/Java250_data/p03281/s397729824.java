import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int ans=0;
    int n = Integer.parseInt(sc.next());
    for (int i = 1; i <= n; i++) {
        if(i%2!=0){
        int count=0;
        for (int j = 1; j <= i; j++) {
            if(i%j==0)count++;
        }
        if(count==8)ans++;
        }
    }
    out.println(ans);
}}